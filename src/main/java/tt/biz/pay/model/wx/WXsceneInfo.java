package tt.biz.pay.model.wx;
/**
 * 
 * @ClassName:  WXsceneInfo   
 * @Description:TODO(场景信息)   
 * @author: tt1498
 * @date:   2017年9月8日 下午1:09:04
 */
public class WXsceneInfo
{
  private String id;//门店id
  private String name;//门店名称
  private String area_code;//门店行政区划码
  private String address;//门店详细地址
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
  public String getArea_code()
  {
    return area_code;
  }
  public void setArea_code(String area_code)
  {
    this.area_code = area_code;
  }
  public String getAddress()
  {
    return address;
  }
  public void setAddress(String address)
  {
    this.address = address;
  }
  
  
}
