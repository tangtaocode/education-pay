package tt.biz.pay.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="wxdto")
public class WxPayDTO implements IPayDTO,Serializable
{ 
  private String device_info;//设备号
  
  private String openid;//用户标识
  
  private String appid;//公众账号ID
  
  private String mch_id;//商户号
  
  private String nonce_str;//随机字符串
  
  private String sign;//签名
  
  private String sign_type;//签名类型
  
  private String result_code;//业务结果
  
  private String err_code;//错误代码
  
  private String err_code_des;//错误代码描述
  
  private String is_subscribe;//是否关注公众账号
    
  private String trade_type;//交易类型
  
  private String bank_type;//付款银行
  
  private int total_fee;//订单金额
  
  private int settlement_total_fee;//应结订单金额
  
  private int cash_fee;//现金支付金额
  
  private String transaction_id;//微信支付订单号
  
  private String out_trade_no;//商户订单号
  
  private String time_end;//支付完成时间
  
  private String return_code;//返回状态码
  
  private String return_msg;//返回信息
  
  public String getDevice_info()
  {
    return device_info;
  }
  @XmlElement  
  public void setDevice_info(String device_info)
  {
    this.device_info = device_info;
  }

  public String getOpenid()
  {
    return openid;
  }
  @XmlElement
  public void setOpenid(String openid)
  {
    this.openid = openid;
  }

  public String getAppid()
  {
    return appid;
  }
  @XmlElement  
  public void setAppid(String appid)
  {
    this.appid = appid;
  }

  public String getMch_id()
  {
    return mch_id;
  }
  @XmlElement  
  public void setMch_id(String mch_id)
  {
    this.mch_id = mch_id;
  }

  public String getNonce_str()
  {
    return nonce_str;
  }
  @XmlElement  
  public void setNonce_str(String nonce_str)
  {
    this.nonce_str = nonce_str;
  }

  public String getSign()
  {
    return sign;
  }
  @XmlElement  
  public void setSign(String sign)
  {
    this.sign = sign;
  }

  public String getSign_type()
  {
    return sign_type;
  }
  @XmlElement  
  public void setSign_type(String sign_type)
  {
    this.sign_type = sign_type;
  }

  public String getResult_code()
  {
    return result_code;
  }
  @XmlElement  
  public void setResult_code(String result_code)
  {
    this.result_code = result_code;
  }

  public String getErr_code()
  {
    return err_code;
  }
  @XmlElement  
  public void setErr_code(String err_code)
  {
    this.err_code = err_code;
  }

  public String getErr_code_des()
  {
    return err_code_des;
  }
  @XmlElement  
  public void setErr_code_des(String err_code_des)
  {
    this.err_code_des = err_code_des;
  }

  public String getIs_subscribe()
  {
    return is_subscribe;
  }
  @XmlElement  
  public void setIs_subscribe(String is_subscribe)
  {
    this.is_subscribe = is_subscribe;
  }

  public String getTrade_type()
  {
    return trade_type;
  }
  @XmlElement  
  public void setTrade_type(String trade_type)
  {
    this.trade_type = trade_type;
  }

  public String getBank_type()
  {
    return bank_type;
  }
  @XmlElement  
  public void setBank_type(String bank_type)
  {
    this.bank_type = bank_type;
  }

  public int getTotal_fee()
  {
    return total_fee;
  }
  @XmlElement  
  public void setTotal_fee(int total_fee)
  {
    this.total_fee = total_fee;
  }

  public int getSettlement_total_fee()
  {
    return settlement_total_fee;
  }
  @XmlElement  
  public void setSettlement_total_fee(int settlement_total_fee)
  {
    this.settlement_total_fee = settlement_total_fee;
  }

  public int getCash_fee()
  {
    return cash_fee;
  }
  @XmlElement  
  public void setCash_fee(int cash_fee)
  {
    this.cash_fee = cash_fee;
  }

  public String getTransaction_id()
  {
    return transaction_id;
  }
  @XmlElement  
  public void setTransaction_id(String transaction_id)
  {
    this.transaction_id = transaction_id;
  }

  public String getOut_trade_no()
  {
    return out_trade_no;
  }
  @XmlElement  
  public void setOut_trade_no(String out_trade_no)
  {
    this.out_trade_no = out_trade_no;
  }

  public String getTime_end()
  {
    return time_end;
  }
  @XmlElement  
  public void setTime_end(String time_end)
  {
    this.time_end = time_end;
  }

  public String getReturn_code()
  {
    return return_code;
  }
  @XmlElement
  public void setReturn_code(String return_code)
  {
    this.return_code = return_code;
  }

  public String getReturn_msg()
  {
    return return_msg;
  }
  @XmlElement
  public void setReturn_msg(String return_msg)
  {
    this.return_msg = return_msg;
  }
  
}
