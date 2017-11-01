package tt.biz.pay.model;

import java.util.List;

import tt.biz.pay.model.ali.OrderRequest;
import tt.biz.pay.model.entity.StockEx;

public class StockVO
{
  private Double totalAmt;//总金额
  private Double totalDisAmt;//总优惠金额
  List<StockEx> listStock;//商品详情
  List<StockEx> allListStock;//所有单品
  private OrderRequest orderRequest;//订单数据
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
  public List<StockEx> getListStock()
  {
    return listStock;
  }
  public void setListStock(List<StockEx> listStock)
  {
    this.listStock = listStock;
  }
  public OrderRequest getOrderRequest()
  {
    return orderRequest;
  }
  public void setOrderRequest(OrderRequest orderRequest)
  {
    this.orderRequest = orderRequest;
  }
  public List<StockEx> getAllListStock()
  {
    return allListStock;
  }
  public void setAllListStock(List<StockEx> allListStock)
  {
    this.allListStock = allListStock;
  }
  
}
