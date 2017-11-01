package tt.biz.pay.model.access;

import java.util.List;

public class WxOrderFlowAccess
{
    private String mobile;//客户手机号码
    private String payTime;//购买时间(yyyy-MM-ddHH:mm)
    private String  orderNo;//订单号
    private String merchantId;//门店id
    private String posNo;//机号
    private String qtyTotal;//数量合计
    private String totalAmount;//订单总额
    private String discountAmount;//折扣总额
    private String zeroAmount;//抹零总额
    private String payAmount;//应收总额
    private String payType;//支付类型
    private List<GoodDetailAccess> data;//明细
    public String getMobile()
    {
      return mobile;
    }
    public void setMobile(String mobile)
    {
      this.mobile = mobile;
    }
    public String getPayTime()
    {
      return payTime;
    }
    public void setPayTime(String payTime)
    {
      this.payTime = payTime;
    }
    public String getOrderNo()
    {
      return orderNo;
    }
    public void setOrderNo(String orderNo)
    {
      this.orderNo = orderNo;
    }
    public String getMerchantId()
    {
      return merchantId;
    }
    public void setMerchantId(String merchantId)
    {
      this.merchantId = merchantId;
    }
    public String getPosNo()
    {
      return posNo;
    }
    public void setPosNo(String posNo)
    {
      this.posNo = posNo;
    }
    public String getQtyTotal()
    {
      return qtyTotal;
    }
    public void setQtyTotal(String qtyTotal)
    {
      this.qtyTotal = qtyTotal;
    }
    public String getTotalAmount()
    {
      return totalAmount;
    }
    public void setTotalAmount(String totalAmount)
    {
      this.totalAmount = totalAmount;
    }
    public String getDiscountAmount()
    {
      return discountAmount;
    }
    public void setDiscountAmount(String discountAmount)
    {
      this.discountAmount = discountAmount;
    }
    public String getZeroAmount()
    {
      return zeroAmount;
    }
    public void setZeroAmount(String zeroAmount)
    {
      this.zeroAmount = zeroAmount;
    }
    public String getPayAmount()
    {
      return payAmount;
    }
    public void setPayAmount(String payAmount)
    {
      this.payAmount = payAmount;
    }
    public String getPayType()
    {
      return payType;
    }
    public void setPayType(String payType)
    {
      this.payType = payType;
    }
    public List<GoodDetailAccess> getData()
    {
      return data;
    }
    public void setData(List<GoodDetailAccess> data)
    {
      this.data = data;
    }
    
}
