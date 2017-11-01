package tt.biz.pay.model.access;

public class SkuAccess
{
  private String mpBarcode;//条码
  private Long num;//数量
  public String getMpBarcode()
  {
    return mpBarcode;
  }
  public void setMpBarcode(String mpBarcode)
  {
    this.mpBarcode = mpBarcode;
  }
  public Long getNum()
  {
    return num;
  }
  public void setNum(Long num)
  {
    this.num = num;
  }
}
