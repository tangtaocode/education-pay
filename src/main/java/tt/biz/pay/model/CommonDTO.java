package tt.biz.pay.model;

import java.io.Serializable;
/**
 * 
 * @ClassName:  CommonDTO   
 * @Description:TODO(公共传输实体)   
 * @author: tt1498
 * @date:   2017年9月12日 上午8:26:24
 */
@SuppressWarnings("serial")
public class CommonDTO implements IPayDTO,Serializable
{
  private String mac;//Android端设备地址
  
  private String openid; //微信号ip
  
  private Double totalAmt;//总金额
  
  private int start=0;
  
  private int  end =0;
  
  public String getMac()
  {
    return mac;
  }
  public void setMac(String mac)
  {
    this.mac = mac;
  }
	public Double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(Double totalAmt) {
		this.totalAmt = totalAmt;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
  public int getStart()
  {
    return start;
  }
  public void setStart(int start)
  {
    this.start = start;
  }
  public int getEnd()
  {
    return end;
  }
  public void setEnd(int end)
  {
    this.end = end;
  }
	
}
