package tt.biz.pay.service.impl;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayConstants;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.request.AlipayTradePrecreateRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.google.gson.Gson;

import tt.biz.pay.component.BaseComponent;
import tt.biz.pay.component.PayMsgSender;
import tt.biz.pay.config.ALconfig;
import tt.biz.pay.mapper.OrderMapper;
import tt.biz.pay.model.AliPayDTO;
import tt.biz.pay.model.CacheObject;
import tt.biz.pay.model.CommonDTO;
import tt.biz.pay.model.DreamResponse;
import tt.biz.pay.model.DreamStatus;
import tt.biz.pay.model.IPayDTO;
import tt.biz.pay.model.MessageType;
import tt.biz.pay.model.StockVO;
import tt.biz.pay.model.ali.AlGoodsDetail;
import tt.biz.pay.model.ali.NotifyResponse;
import tt.biz.pay.model.ali.OrderRequest;
import tt.biz.pay.model.entity.Order;
import tt.biz.pay.model.entity.OrderItem;
import tt.biz.pay.model.entity.StockEx;
import tt.biz.pay.service.IAlipayService;
import tt.biz.pay.service.IPriceSearchService;
import tt.biz.pay.utils.BeanUtil;
import tt.biz.pay.utils.OrderUtil;
import tt.biz.pay.utils.RedisCacheServiceImpl;
import tt.biz.pay.utils.RequestUtil;
import tt.biz.pay.utils.StockUtil;

@Service
@Transactional
@SuppressWarnings("rawtypes")
public class AlipayServiceImpl extends BaseComponent implements IAlipayService {
	private static Logger logger = Logger.getLogger(AlipayServiceImpl.class);
	@Autowired
	private ALconfig alconfig;
	@Autowired
	private IPriceSearchService priceSearchService;
	@Autowired
	private OrderMapper orderMapper;
	@Override
	public DreamResponse unifiedOrder(IPayDTO dto) {
		DreamResponse res = new DreamResponse();
		CommonDTO real = (CommonDTO) dto;
		if (real.getMac() == null) {
			res.setMsg("设备地址不能为空！");
			res.setStatus(DreamStatus.FAIL);
			return res;
		}
		Map<String, Object> exmap = new HashMap<String, Object>();
		try {
			AlipayClient alipayClient = new DefaultAlipayClient(alconfig.getOrder_request_url(), alconfig.getAppID(),
					alconfig.getPrivate_key(), alconfig.getContent_type(), alconfig.getCharset(),
					alconfig.getPublic_key(), alconfig.getSecret_type());
			AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
			request.setNotifyUrl(alconfig.getNotify_url());
			request.setNeedEncrypt(false);// 不要求加密
			StockVO stockVo = getOrder(real);
			OrderRequest order = stockVo.getOrderRequest();
			if (stockVo.getListStock().isEmpty()) {
				res.setMsg("商品信息为空！");
				res.setStatus(DreamStatus.FAIL);
				return res;
			}
			request.setBizContent(new Gson().toJson(order));
			logger.info("*******支付宝订单输入参数:" + new Gson().toJson(request));
			AlipayTradePrecreateResponse response = alipayClient.execute(request);
			exmap = BeanUtil.objectToMap(response);
			logger.info("*******支付宝订单返回参数:" + new Gson().toJson(response));
			if (response.isSuccess()) {
				res.setMsg("支付宝下订单成功！");
				res.setStatus(DreamStatus.SUCCESS);
				// 下单成功存入redies缓存
//				CacheObject cache = new CacheObject();
//				cache.setDevice_info(real.getMac());
//				cache.setOut_trade_no(order.getOut_trade_no());
//				cache.setUserId(real.getOpenid());
//				cache.setIspay(false);
				//redis.set(order.getOut_trade_no(), cache, 4 * 60 * 60L);
				exmap.put("totalAmt", stockVo.getTotalAmt() + "");
				exmap.put("totalDisAmt", stockVo.getTotalDisAmt() + "");
				res.setExtData(exmap);
				res.setData(StockUtil.filterItem(stockVo.getListStock()));
			} else {
				res.setMsg("支付宝下订单失败！");
				res.setStatus(DreamStatus.FAIL);
				res.setExtData(exmap);
			}
		} catch (Exception e) {
			e.printStackTrace();
			res.setMsg("支付宝下订单失败！");
			res.setStatus(DreamStatus.FAIL);
			res.setExtData(exmap);
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		return res;
	}

	/**
	 * @Description: TODO(生成订单实体)
	 */
	private StockVO getOrder(CommonDTO real) {
		OrderRequest res = new OrderRequest();
		StockVO stockVo = priceSearchService.getSKUPrice(real);
		res.setOut_trade_no(OrderUtil.generateOrderNo());
		res.setTimeout_express("90m");
		res.setTerminal_id(real.getMac());
		res.setTotal_amount(stockVo.getTotalAmt());
		res.setSubject(res.getOut_trade_no());
		res.setStore_id("1");
		List<AlGoodsDetail> goods_detail = new ArrayList<AlGoodsDetail>();
		AlGoodsDetail goodDetai = null;
		for (StockEx stock : stockVo.getListStock()) {
			goodDetai = new AlGoodsDetail();
			goodDetai.setGoods_name(stock.getName());
			goodDetai.setPrice(stock.getPrice01().doubleValue());
			goodDetai.setQuantity(stock.getQty());
			goodDetai.setGoods_id(stock.getBarcode());
			goodDetai.setGoods_category(stock.getClassifyName());
			goods_detail.add(goodDetai);
		}
		res.setGoods_detail(goods_detail);
		stockVo.setOrderRequest(res);
		return stockVo;
	}

	@Override
	public DreamResponse orderQuery(IPayDTO dto) {
		DreamResponse<StockEx> res = new DreamResponse<>();
		AliPayDTO real = (AliPayDTO) dto;
		
		String outTradeNo = real.getOut_trade_no();//用于接收支付宝根据传入交易号或订单号后返回的商户订单号
		//String tradeNo = real.getTrade_no();
		res.setStatus(DreamStatus.FAIL);
		
		
		Map<String, Object> exmap = new HashMap<>();
		try {
			AlipayClient alipayClient = new DefaultAlipayClient(alconfig.getOrder_request_url(), alconfig.getAppID(),
					alconfig.getPrivate_key(), alconfig.getContent_type(), alconfig.getCharset(), alconfig.getPublic_key(), alconfig.getSecret_type());
			AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
			Map<String, String> aliParam = new HashMap<>();
			aliParam.put("out_trade_no", outTradeNo);
			//aliParam.put("trade_no", tradeNo);
			request.setBizContent(new Gson().toJson(aliParam));
			logger.info("*******支付宝订单查询输入参数:" + new Gson().toJson(request));
			AlipayTradeQueryResponse response = alipayClient.execute(request);
			exmap = BeanUtil.objectToMap(response);//将支付宝查询返回参数转换成map作为扩展数据设置回res
			logger.info("*******支付宝订单查询返回参数:" + new Gson().toJson(response));
			
			//outTradeNo = response.getOutTradeNo();
			//tradeNo = response.getTradeNo();
            //查询该订单号的商品详情
            OrderItem record = new OrderItem();//构建查询条件
            CommonDTO queryParam = new CommonDTO();
            StockVO stockVo = priceSearchService.getSKUPrice(queryParam);
			
			String tradeStatus = null;
			if (response.isSuccess()) {
				res.setStatus(DreamStatus.SUCCESS);
				//交易的订单金额,单位为元,两位小数。为支付时传入的total_amount
				//exmap.put("totalAmt", response.getTotalAmount());
				exmap.put("totalAmt", stockVo.getTotalAmt() + "");
				exmap.put("totalDisAmt", stockVo.getTotalDisAmt() + "");
				res.setExtData(exmap);
				
				/*List<StockEx> listStock = stockVo.getListStock();//订单中的所有商品
				res.setData(listStock);
				res.setTotal(listStock.size());*/
				
				tradeStatus = response.getTradeStatus();//支付宝订单状态
				if(DreamStatus.AliPayStatus.WAIT_BUYER_PAY.equals(tradeStatus)) {
					res.setMsg("等待买家付款!");
				}else if(DreamStatus.AliPayStatus.TRADE_CLOSED.equals(tradeStatus)) {
					res.setMsg("交易超时或已全额退款!");
				}else if(DreamStatus.AliPayStatus.TRADE_SUCCESS.equals(tradeStatus)) {
					res.setMsg("该交易支付成功!");
				}else if(DreamStatus.AliPayStatus.TRADE_FINISHED.equals(tradeStatus)) {
					res.setMsg("交易结束,不可退款!");
				}
			} else {
				if(DreamStatus.AliPayStatus.ACQ_SYSTEM_ERROR.equals(tradeStatus)) {
					res.setMsg("系统错误,请重新查询!");
				} else if(DreamStatus.AliPayStatus.ACQ_INVALID_PARAMETER.equals(tradeStatus)) {
					res.setMsg("参数无效,请检查请求参数后重新查询!");
				} else if(DreamStatus.AliPayStatus.ACQ_TRADE_NOT_EXIST.equals(tradeStatus)) {
					res.setMsg("查询的交易不存在，请检查传入的交易号是否正确!");
				} else {
					res.setMsg("支付宝订单查询失败！");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			res.setMsg("支付宝订单查询失败！");
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		return res;
	}

	@Override
	public DreamResponse reverse(IPayDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String notify(IPayDTO dto) {
		String revalue = "false";// 默认失败
		Map<String, Object> map = new HashMap<String, Object>();
		NotifyResponse real = (NotifyResponse) dto;
		Map<String, String> params = new HashMap<String, String>();
		try {
			params = RequestUtil.getRequestParams(request);
			logger.info("******支付宝通知成功：" + new Gson().toJson(params));
			if (isPay(real.getOut_trade_no())) {// 已通知过,无参数无需通知
				return DreamStatus.SUCCESS.toLowerCase();
			}
			if (AlipaySignature.rsaCheckV1(params, alconfig.getPublic_key(), alconfig.getCharset(),
					alconfig.getSecret_type())) {
				// 签名正确
				logger.info("支付宝验签成功：" + new Gson().toJson(real));
				if ("TRADE_SUCCESS".equals(real.getTrade_status())) {
					map.put("out_trade_no", real.getOut_trade_no());
					map.put("status", DreamStatus.SUCCESS);
					map.put("type", MessageType.PAY_OVER);
                    Order order = new Order();
                    order.setOrderNo(real.getOut_trade_no());
                    order = orderMapper.selectByParams(order);
                    order.setStatus(DreamStatus.SUCCESS);
                    orderMapper.updateByPrimaryKeySelective(order);
//					CacheObject cache = new CacheObject();
//					cache = (CacheObject) redis.get(real.getOut_trade_no());
//					cache.setIspay(true);
//					redis.remove(real.getOut_trade_no());
//					redis.set(real.getOut_trade_no(), cache, 4 * 60 * 60L);
					String mjson = new Gson().toJson(map);
					// 发送推送小票流水消息
//					map.put("type", MessageType.PUSH_MESS);
//					mjson = new Gson().toJson(cache);
//					payMsgSender.sendServer(mjson);
					revalue = DreamStatus.SUCCESS.toLowerCase();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("***********支付宝消息通知异常*************", e);
		}
		return revalue;
	}

	private boolean isPay(String out_trade_no) {
	  Order order = new Order();
      order.setOrderNo(out_trade_no);
      order = orderMapper.selectByParams(order);
      return DreamStatus.SUCCESS.equals(order.getStatus());
	}

	@Override
	public void getWay() {
		// 支付宝响应消息
		String responseMsg = "";
		// 1. 解析请求参数
		Map<String, String> params = RequestUtil.getRequestParams(request);
		logger.info("***********支付宝网关通知消息map*************" + params);
		try {
			if (!AlipaySignature.rsaCheckV2(params, alconfig.getPublic_key(), "GBK", alconfig.getSecret_type())) {
				logger.info("***********支付宝网关验签失败*************" + params.toString());
				throw new AlipayApiException("verify sign fail.");
			}
			String bizContent = params.get("biz_content");
			logger.info("***********支付宝网关bizContent*************" + bizContent);
			// 将XML转化成json对象
			// JSONObject bizContentJson = (JSONObject) new
			// XMLSerializer().read(bizContent);
			responseMsg = buildBaseAckMsg(alconfig.getSelf_public_key());
			// 对响应内容加签
			responseMsg = encryptAndSign(responseMsg, alconfig.getPublic_key(), alconfig.getPrivate_key(),
					alconfig.getCharset(), false, true, alconfig.getSecret_type());
			// http 内容应答
			logger.info("***********支付宝网关应答内容*************" + responseMsg);
			response.reset();
			response.setContentType("text/xml;charset=GBK");
			PrintWriter printWriter = response.getWriter();
			printWriter.print(responseMsg);
			response.flushBuffer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String encryptAndSign(String bizContent, String alipayPublicKey, String cusPrivateKey, String charset,
			boolean isEncrypt, boolean isSign, String signType) throws AlipayApiException {
		StringBuilder sb = new StringBuilder();
		if (StringUtils.isEmpty(charset)) {
			charset = AlipayConstants.CHARSET_GBK;
		}
		sb.append("<?xml version=\"1.0\" encoding=\"" + charset + "\"?>");
		if (isEncrypt) {// 加密
			sb.append("<alipay>");
			String encrypted = AlipaySignature.rsaEncrypt(bizContent, alipayPublicKey, charset);
			sb.append("<response>" + encrypted + "</response>");
			sb.append("<encryption_type>AES</encryption_type>");
			if (isSign) {
				String sign = AlipaySignature.rsaSign(encrypted, cusPrivateKey, charset, signType);
				sb.append("<sign>" + sign + "</sign>");
				sb.append("<sign_type>");
				sb.append(signType);
				sb.append("</sign_type>");
			}
			sb.append("</alipay>");
		} else if (isSign) {// 不加密，但需要签名
			sb.append("<alipay>");
			sb.append("<response>" + bizContent + "</response>");
			String sign = AlipaySignature.rsaSign(bizContent, cusPrivateKey, charset, signType);
			sb.append("<sign>" + sign + "</sign>");
			sb.append("<sign_type>");
			sb.append(signType);
			sb.append("</sign_type>");
			sb.append("</alipay>");
		} else {// 不加密，不加签
			sb.append(bizContent);
		}
		return sb.toString();
	}

	/**
	 * 构造基础的响应消息
	 * 
	 * @return
	 */
	public String buildBaseAckMsg(String publickey) {
		// 固定响应格式，必须按此格式返回
		StringBuilder builder = new StringBuilder();
		builder.append("<success>").append(Boolean.TRUE.toString()).append("</success>");
		builder.append("<biz_content>").append(publickey).append("</biz_content>");
		return builder.toString();
	}
}
