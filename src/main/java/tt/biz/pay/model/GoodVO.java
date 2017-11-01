package tt.biz.pay.model;

import java.math.BigDecimal;

public class GoodVO implements Cloneable 
{
  private Long qty;// 实盘数量 
  
  private String name;
  
  private BigDecimal price01;
  
  private BigDecimal price02;
  
  private String status;
  
  private String unit;
  
  public String getUnit()
  {
    return unit;
  }

  public void setUnit(String unit)
  {
    this.unit = unit;
  }

  public Long getQty()
  {
    return qty;
  }

  public void setQty(Long qty)
  {
    this.qty = qty;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public BigDecimal getPrice01()
  {
    return price01;
  }

  public void setPrice01(BigDecimal price01)
  {
    this.price01 = price01;
  }

  public BigDecimal getPrice02()
  {
    return price02;
  }

  public void setPrice02(BigDecimal price02)
  {
    this.price02 = price02;
  }

  public String getStatus()
  {
    return status;
  }

  public void setStatus(String status)
  {
    this.status = status;
  }
  @Override
  protected GoodVO clone()
    throws CloneNotSupportedException
  {
    // TODO Auto-generated method stub
    return (GoodVO)super.clone();
  }
  
  public GoodVO copy()
  {
    GoodVO re = null;
    try
    {
      re = clone();
    }
    catch (CloneNotSupportedException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return re;
  }
}
