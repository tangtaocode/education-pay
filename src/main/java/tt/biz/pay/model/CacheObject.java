package tt.biz.pay.model;

import java.io.Serializable;

import tt.biz.pay.model.access.MemberAccess;

@SuppressWarnings("serial")
public class CacheObject implements Serializable
{
  private String out_trade_no;
  private boolean ispay;
  private String device_info;
  private Long userId; 
  private MemberAccess member;
  
  public Long getUserId()
  {
    return userId;
  }
  public void setUserId(Long userId)
  {
    this.userId = userId;
  }
  public String getOut_trade_no()
  {
    return out_trade_no;
  }
  public void setOut_trade_no(String out_trade_no)
  {
    this.out_trade_no = out_trade_no;
  }
  public boolean isIspay()
  {
    return ispay;
  }
  public void setIspay(boolean ispay)
  {
    this.ispay = ispay;
  }
  public String getDevice_info()
  {
    return device_info;
  }
  public void setDevice_info(String device_info)
  {
    this.device_info = device_info;
  }
  public MemberAccess getMember()
  {
    return member;
  }
  public void setMember(MemberAccess member)
  {
    this.member = member;
  }
}
