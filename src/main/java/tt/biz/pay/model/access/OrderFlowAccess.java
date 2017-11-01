package tt.biz.pay.model.access;

import java.util.List;

/**
 * 
 * @ClassName:  OrderFlowAccess   
 * @Description:TODO(接入第三方订单流水)   
 */
public class OrderFlowAccess
{
  private String merchantId;//门店ID
  private String userId;//用户ID
  private String flowNo;//交易流水
  private String thirdPartOrderId;//第三方订单号
  private String uniqueCode;//uuid
  private String terminalId;//终端Id
  private String source;//来源：1.视觉无人店 2.RFID
  private String skus;//拼接JSON数组字符串，列如：[{"mpBarcode":,"num":0},]
  private String payStatus;///订单支付状态， 支付状态， 支付状态， 0：未支付 未支付 1：已支付
  private String payType;//支付类型，1-员工卡2-微信3-支付宝
  private String payAmount;//总金额
  public String getMerchantId()
  {
    return merchantId;
  }
  public void setMerchantId(String merchantId)
  {
    this.merchantId = merchantId;
  }
  public String getUserId()
  {
    return userId;
  }
  public void setUserId(String userId)
  {
    this.userId = userId;
  }
  public String getFlowNo()
  {
    return flowNo;
  }
  public void setFlowNo(String flowNo)
  {
    this.flowNo = flowNo;
  }

  public String getThirdPartOrderId()
  {
    return thirdPartOrderId;
  }
  public void setThirdPartOrderId(String thirdPartOrderId)
  {
    this.thirdPartOrderId = thirdPartOrderId;
  }
  public String getUniqueCode()
  {
    return uniqueCode;
  }
  public void setUniqueCode(String uniqueCode)
  {
    this.uniqueCode = uniqueCode;
  }
  public String getTerminalId()
  {
    return terminalId;
  }
  public void setTerminalId(String terminalId)
  {
    this.terminalId = terminalId;
  }
  public String getSource()
  {
    return source;
  }
  public void setSource(String source)
  {
    this.source = source;
  }
  public String getSkus()
  {
    return skus;
  }
  public void setSkus(String skus)
  {
    this.skus = skus;
  }
  public String getPayStatus()
  {
    return payStatus;
  }
  public void setPayStatus(String payStatus)
  {
    this.payStatus = payStatus;
  }
  public String getPayType()
  {
    return payType;
  }
  public void setPayType(String payType)
  {
    this.payType = payType;
  }
  public String getPayAmount()
  {
    return payAmount;
  }
  public void setPayAmount(String payAmount)
  {
    this.payAmount = payAmount;
  }
  
}
