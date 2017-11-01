package tt.biz.pay.model.wx;
/**
 * 
 * @ClassName:  WXrequestParamsBean   
 * @Description:TODO(微信请求参数bean)   
 * @author: tt1498
 * @date:   2017年9月8日 下午12:53:00
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WXrequestParamsBean
{
  @Value("${wx_notify_url}")
  private String notify_url;//通知地址
  @Value("${wx_spbill_create_ip}")
  private String spbill_create_ip;//终端IP
  private GoodsDetail detail;//商品描述
  private String attach;//附加数据
  private String out_trade_no;//商户订单号
  private String fee_type="CNY";//标价币种
  private int total_fee;//标价金额
  private String time_start;//交易起始时间
  private String time_expire;//交易结束时间
  private String goods_tag;//订单优惠标记
  private String trade_type;//交易类型
  private String product_id;//商品ID
  private String limit_pay;//指定支付方式
  private String openid;//用户标识
  private String WXsceneInfo;//场景信息
  public GoodsDetail getDetail()
  {
    return detail;
  }
  public void setDetail(GoodsDetail detail)
  {
    this.detail = detail;
  }
  public String getAttach()
  {
    return attach;
  }
  public void setAttach(String attach)
  {
    this.attach = attach;
  }
  public String getOut_trade_no()
  {
    return out_trade_no;
  }
  public void setOut_trade_no(String out_trade_no)
  {
    this.out_trade_no = out_trade_no;
  }
  public String getFee_type()
  {
    return fee_type;
  }
  public void setFee_type(String fee_type)
  {
    this.fee_type = fee_type;
  }
  public int getTotal_fee()
  {
    return total_fee;
  }
  public void setTotal_fee(int total_fee)
  {
    this.total_fee = total_fee;
  }
  public String getSpbill_create_ip()
  {
    return spbill_create_ip;
  }
  public void setSpbill_create_ip(String spbill_create_ip)
  {
    this.spbill_create_ip = spbill_create_ip;
  }
  public String getTime_start()
  {
    return time_start;
  }
  public void setTime_start(String time_start)
  {
    this.time_start = time_start;
  }
  public String getTime_expire()
  {
    return time_expire;
  }
  public void setTime_expire(String time_expire)
  {
    this.time_expire = time_expire;
  }
  public String getGoods_tag()
  {
    return goods_tag;
  }
  public void setGoods_tag(String goods_tag)
  {
    this.goods_tag = goods_tag;
  }
  public String getNotify_url()
  {
    return notify_url;
  }
  public void setNotify_url(String notify_url)
  {
    this.notify_url = notify_url;
  }
  public String getTrade_type()
  {
    return trade_type;
  }
  public void setTrade_type(String trade_type)
  {
    this.trade_type = trade_type;
  }
  public String getProduct_id()
  {
    return product_id;
  }
  public void setProduct_id(String product_id)
  {
    this.product_id = product_id;
  }
  public String getLimit_pay()
  {
    return limit_pay;
  }
  public void setLimit_pay(String limit_pay)
  {
    this.limit_pay = limit_pay;
  }
  public String getOpenid()
  {
    return openid;
  }
  public void setOpenid(String openid)
  {
    this.openid = openid;
  }
  public String getWXsceneInfo()
  {
    return WXsceneInfo;
  }
  public void setWXsceneInfo(String wXsceneInfo)
  {
    WXsceneInfo = wXsceneInfo;
  }
}
