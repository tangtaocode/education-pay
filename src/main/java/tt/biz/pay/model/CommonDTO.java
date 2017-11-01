package tt.biz.pay.model;

import java.io.Serializable;
import java.util.List;
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
	
}
