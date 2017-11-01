package tt.biz.pay.model;

/**   
 * @ClassName:  AliPayDTO   
 * @Description:TODO 支付宝参数传输实体
 * @author: lenovo
 * @date:   2017年9月25日 上午10:29:23   
 */  
public class AliPayDTO extends CommonDTO {
  
  //trade_no,out_trade_no如果同时存在优先取trade_no
  private String out_trade_no;//商户订单号
  
  private String trade_no;//支付宝/微信交易号,和商户订单号不能同时为空

  public String getOut_trade_no()
  {
    return out_trade_no;
  }

  public void setOut_trade_no(String out_trade_no)
  {
    this.out_trade_no = out_trade_no;
  }

  public String getTrade_no()
  {
    return trade_no;
  }

  public void setTrade_no(String trade_no)
  {
    this.trade_no = trade_no;
  }

}
