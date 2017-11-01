package tt.biz.pay.model.access;

public class GoodDetailAccess
{
    private String fname;//商品名称
    private Long qty;//商品名称
    private Double price;//单价
    private Double total;//金额
    public String getFname()
    {
      return fname;
    }
    public void setFname(String fname)
    {
      this.fname = fname;
    }
    public Double getPrice()
    {
      return price;
    }
    public void setPrice(Double price)
    {
      this.price = price;
    }
    public Double getTotal()
    {
      return total;
    }
    public void setTotal(Double total)
    {
      this.total = total;
    }
    public Long getQty()
    {
      return qty;
    }
    public void setQty(Long qty)
    {
      this.qty = qty;
    }
    
}
