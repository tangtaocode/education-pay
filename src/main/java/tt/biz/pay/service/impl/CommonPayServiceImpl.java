package tt.biz.pay.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tt.biz.pay.mapper.OrderMapper;
import tt.biz.pay.model.AliPayDTO;
import tt.biz.pay.model.CommonDTO;
import tt.biz.pay.model.DreamResponse;
import tt.biz.pay.model.DreamStatus;
import tt.biz.pay.model.GoodVO;
import tt.biz.pay.model.IPayDTO;
import tt.biz.pay.model.StockVO;
import tt.biz.pay.model.WxPayDTO;
import tt.biz.pay.model.entity.Order;
import tt.biz.pay.model.entity.StockEx;
import tt.biz.pay.service.IAlipayService;
import tt.biz.pay.service.ICommonPayService;
import tt.biz.pay.service.IPriceSearchService;
import tt.biz.pay.service.IWxpayService;
import tt.biz.pay.utils.StockUtil;
@Service
@Transactional
public class CommonPayServiceImpl implements ICommonPayService {
  @Autowired
  private IAlipayService alipayService;
  @Autowired
  private IWxpayService wxpayService;
  @Autowired
  private IPriceSearchService priceSearchService;
  @Autowired
  private OrderMapper orderMapper;
  
  @Override
  public DreamResponse multUnifiedOrder(IPayDTO dto) {
    DreamResponse revalue =  new DreamResponse();
    DreamResponse alresponse = alipayService.unifiedOrder(dto);
    DreamResponse wxresponse = wxpayService.unifiedOrder(dto);
    Map<String,Object> exmap = new HashMap<String,Object>();
    exmap.put("wx_url", wxresponse.getExtData().get("code_url"));
    exmap.put("wx_code", wxresponse.getExtData().get("out_trade_no"));
    exmap.put("wx_msg", wxresponse.getMsg());
    exmap.put("al_url", alresponse.getExtData().get("qrCode"));
    exmap.put("al_code", alresponse.getExtData().get("outTradeNo"));
    exmap.put("al_msg", alresponse.getMsg());
    exmap.put("totalAmt", wxresponse.getExtData().get("totalAmt"));//总金额
    exmap.put("totalDisAmt", wxresponse.getExtData().get("totalDisAmt"));//优惠金额
    revalue.setExtData(exmap);
    revalue.setData(wxresponse.getData());
    revalue.setStatus(wxresponse.getStatus());
    return revalue;
  }
  
  
  @SuppressWarnings("rawtypes")
  @Override
  public DreamResponse orderQuery(String out_trade_no) {
    
    //构建查询条件,通过订单号获取支付方式进行对应的查询
    Order queryParam = new Order();
    queryParam.setOrderNo(out_trade_no);
    Order order = orderMapper.selectByParams(queryParam);
    DreamResponse res = new DreamResponse();
    res.setStatus(DreamStatus.FAIL);
    if(order == null) {
      res.setMsg("此交易订单号不存在!");
      return res;
    }
    
    String payType = order.getPaymentType();
    if (DreamStatus.AL.equals(payType)) { //支付宝订单状态查询
      AliPayDTO dto = new AliPayDTO();
      dto.setOut_trade_no(out_trade_no);
      return alipayService.orderQuery(dto);
    }
    if (DreamStatus.WX.equals(payType)) { //微信状态查询
      WxPayDTO dto = new WxPayDTO();
      dto.setOut_trade_no(out_trade_no);
      return wxpayService.orderQuery(dto);
    }
    res.setMsg("支付类型错误!");
    return res;
  }

}
