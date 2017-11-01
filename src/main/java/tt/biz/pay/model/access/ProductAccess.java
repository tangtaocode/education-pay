package tt.biz.pay.model.access;
public class ProductAccess
{
  private Long merchantId;//门店ID
  private String barcode;//条码
  private Long mpId;//商品ID
  private String mpCode;//商品编码
  private Double mpPrice;//商品含税价格
  private Double mpDisAmt;//商品优惠后的金额
  private Long num;//数量
  private String mpName;//商品名称
  private String subtitle;//商品副标题
  private String unit;//计量单位
  public Long getMerchantId()
  {
    return merchantId;
  }
  public void setMerchantId(Long merchantId)
  {
    this.merchantId = merchantId;
  }
  public String getBarcode()
  {
    return barcode;
  }
  public void setBarcode(String barcode)
  {
    this.barcode = barcode;
  }
  public Long getMpId()
  {
    return mpId;
  }
  public void setMpId(Long mpId)
  {
    this.mpId = mpId;
  }
  public String getMpCode()
  {
    return mpCode;
  }
  public void setMpCode(String mpCode)
  {
    this.mpCode = mpCode;
  }
  public Double getMpPrice()
  {
    return mpPrice;
  }
  public void setMpPrice(Double mpPrice)
  {
    this.mpPrice = mpPrice;
  }
  public Double getMpDisAmt()
  {
    return mpDisAmt;
  }
  public void setMpDisAmt(Double mpDisAmt)
  {
    this.mpDisAmt = mpDisAmt;
  }
  public Long getNum()
  {
    return num;
  }
  public void setNum(Long num)
  {
    this.num = num;
  }
  public String getMpName()
  {
    return mpName;
  }
  public void setMpName(String mpName)
  {
    this.mpName = mpName;
  }
  public String getSubtitle()
  {
    return subtitle;
  }
  public void setSubtitle(String subtitle)
  {
    this.subtitle = subtitle;
  }
  public String getUnit()
  {
    return unit;
  }
  public void setUnit(String unit)
  {
    this.unit = unit;
  }
  
}
