package tt.biz.pay.model.ali;

import tt.biz.pay.model.IPayDTO;

public class NotifyResponse implements IPayDTO
{
  private String notify_time;//通知的发送时间。格式为yyyy-MM-dd HH:mm:ss
  private String notify_type;// 通知的类型
  private String notify_id;//通知校验ID
  private String sign_type;//签名类型
  private String sign;//签名
  private String trade_no;//支付宝交易号
  private String app_id;//开发者的app_id
  private String out_trade_no;//商户订单号 
  private String out_biz_no;//商户业务号
  private String buyer_id;//买家支付宝用户号
  private String buyer_logon_id;//买家支付宝账号
  private String seller_id;//卖家支付宝用户号
  private String seller_email;//卖家支付宝账号
  private String trade_status;//交易状态
  private Double total_amount;//订单金额
  private Double receipt_amount;//实收金额
  private Double invoice_amount;//开票金额
  private Double buyer_pay_amount;//付款金额
  private Double point_amount;//集分宝金额
  private Double refund_fee;//总退款金额
  private Double send_back_fee;//实际退款金额
  private String subject;//订单标题
  private String body;//商品描述
  private String gmt_create;//交易创建时间
  private String gmt_payment;//交易付款时间
  private String gmt_refund;//交易退款时间
  private String gmt_close;//交易结束时间   
  private String fund_bill_list;//支付金额信息
  public String getNotify_type()
  {
    return notify_type;
  }
  public void setNotify_type(String notify_type)
  {
    this.notify_type = notify_type;
  }
  public String getNotify_id()
  {
    return notify_id;
  }
  public void setNotify_id(String notify_id)
  {
    this.notify_id = notify_id;
  }
  public String getSign_type()
  {
    return sign_type;
  }
  public void setSign_type(String sign_type)
  {
    this.sign_type = sign_type;
  }
  public String getSign()
  {
    return sign;
  }
  public void setSign(String sign)
  {
    this.sign = sign;
  }
  public String getTrade_no()
  {
    return trade_no;
  }
  public void setTrade_no(String trade_no)
  {
    this.trade_no = trade_no;
  }
  public String getApp_id()
  {
    return app_id;
  }
  public void setApp_id(String app_id)
  {
    this.app_id = app_id;
  }
  public String getOut_trade_no()
  {
    return out_trade_no;
  }
  public void setOut_trade_no(String out_trade_no)
  {
    this.out_trade_no = out_trade_no;
  }
  public String getOut_biz_no()
  {
    return out_biz_no;
  }
  public void setOut_biz_no(String out_biz_no)
  {
    this.out_biz_no = out_biz_no;
  }
  public String getBuyer_id()
  {
    return buyer_id;
  }
  public void setBuyer_id(String buyer_id)
  {
    this.buyer_id = buyer_id;
  }
  public String getBuyer_logon_id()
  {
    return buyer_logon_id;
  }
  public void setBuyer_logon_id(String buyer_logon_id)
  {
    this.buyer_logon_id = buyer_logon_id;
  }
  public String getSeller_id()
  {
    return seller_id;
  }
  public void setSeller_id(String seller_id)
  {
    this.seller_id = seller_id;
  }
  public String getSeller_email()
  {
    return seller_email;
  }
  public void setSeller_email(String seller_email)
  {
    this.seller_email = seller_email;
  }
  public String getTrade_status()
  {
    return trade_status;
  }
  public void setTrade_status(String trade_status)
  {
    this.trade_status = trade_status;
  }
  public Double getTotal_amount()
  {
    return total_amount;
  }
  public void setTotal_amount(Double total_amount)
  {
    this.total_amount = total_amount;
  }
  public Double getReceipt_amount()
  {
    return receipt_amount;
  }
  public void setReceipt_amount(Double receipt_amount)
  {
    this.receipt_amount = receipt_amount;
  }
  public Double getInvoice_amount()
  {
    return invoice_amount;
  }
  public void setInvoice_amount(Double invoice_amount)
  {
    this.invoice_amount = invoice_amount;
  }
  public Double getBuyer_pay_amount()
  {
    return buyer_pay_amount;
  }
  public void setBuyer_pay_amount(Double buyer_pay_amount)
  {
    this.buyer_pay_amount = buyer_pay_amount;
  }
  public Double getPoint_amount()
  {
    return point_amount;
  }
  public void setPoint_amount(Double point_amount)
  {
    this.point_amount = point_amount;
  }
  public Double getRefund_fee()
  {
    return refund_fee;
  }
  public void setRefund_fee(Double refund_fee)
  {
    this.refund_fee = refund_fee;
  }
  public Double getSend_back_fee()
  {
    return send_back_fee;
  }
  public void setSend_back_fee(Double send_back_fee)
  {
    this.send_back_fee = send_back_fee;
  }
  public String getSubject()
  {
    return subject;
  }
  public void setSubject(String subject)
  {
    this.subject = subject;
  }
  public String getBody()
  {
    return body;
  }
  public void setBody(String body)
  {
    this.body = body;
  }
  public String getFund_bill_list()
  {
    return fund_bill_list;
  }
  public void setFund_bill_list(String fund_bill_list)
  {
    this.fund_bill_list = fund_bill_list;
  }
  public String getNotify_time()
  {
    return notify_time;
  }
  public void setNotify_time(String notify_time)
  {
    this.notify_time = notify_time;
  }
  public String getGmt_create()
  {
    return gmt_create;
  }
  public void setGmt_create(String gmt_create)
  {
    this.gmt_create = gmt_create;
  }
  public String getGmt_payment()
  {
    return gmt_payment;
  }
  public void setGmt_payment(String gmt_payment)
  {
    this.gmt_payment = gmt_payment;
  }
  public String getGmt_refund()
  {
    return gmt_refund;
  }
  public void setGmt_refund(String gmt_refund)
  {
    this.gmt_refund = gmt_refund;
  }
  public String getGmt_close()
  {
    return gmt_close;
  }
  public void setGmt_close(String gmt_close)
  {
    this.gmt_close = gmt_close;
  }
}
