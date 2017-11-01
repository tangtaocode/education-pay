package tt.biz.pay.model.access;

import java.io.Serializable;

public class MemberAccess implements Serializable
{
    /**   
   * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)   
   */   
  private static final long serialVersionUID = 1L;
    private String id;//会员id
    private String name;//会员名称
    private String mobile;//电话
    private String merchantId;//门店id
    private String mac;//收银mac地址
    private String url;//照片url
    
    public String getMac()
    {
      return mac;
    }
    public void setMac(String mac)
    {
      this.mac = mac;
    }
    public String getUrl()
    {
      return url;
    }
    public void setUrl(String url)
    {
      this.url = url;
    }
    public String getId()
    {
      return id;
    }
    public void setId(String id)
    {
      this.id = id;
    }
    public String getName()
    {
      return name;
    }
    public void setName(String name)
    {
      this.name = name;
    }
    public String getMobile()
    {
      return mobile;
    }
    public void setMobile(String mobile)
    {
      this.mobile = mobile;
    }
    public String getMerchantId()
    {
      return merchantId;
    }
    public void setMerchantId(String merchantId)
    {
      this.merchantId = merchantId;
    }
    
}
