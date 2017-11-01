package tt.biz.pay.model.access;

import java.util.List;

public class PriceGoodAccess
{
    private Double totalAmt;//总金额
    private Double totalDisAmt;//总优惠金额
    private List<ProductAccess> productList;
    public Double getTotalAmt()
    {
      return totalAmt;
    }
    public void setTotalAmt(Double totalAmt)
    {
      this.totalAmt = totalAmt;
    }
    public Double getTotalDisAmt()
    {
      return totalDisAmt;
    }
    public void setTotalDisAmt(Double totalDisAmt)
    {
      this.totalDisAmt = totalDisAmt;
    }
    public List<ProductAccess> getProductList()
    {
      return productList;
    }
    public void setProductList(List<ProductAccess> productList)
    {
      this.productList = productList;
    }
}
