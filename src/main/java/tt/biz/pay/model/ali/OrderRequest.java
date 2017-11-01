package tt.biz.pay.model.ali;

import java.util.List;

import com.alipay.api.domain.ExtendParams;
import com.alipay.api.domain.GoodsDetail;

public class OrderRequest
{
  private String out_trade_no;//商户订单号,64个字符以内、只能包含字母、数字、下划线
  private String seller_id;//卖家支付宝用户ID
  private Double total_amount;//订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000] 
  private Double discountable_amount;//可打折金额. 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围
  private String subject;//订单标题
  private String body;//对交易或商品的描述
  private String buyer_id;//买家的支付宝唯一用户号（2088开头的16位纯数字
  private List<AlGoodsDetail> goods_detail;//订单包含的商品列表信息.Json格式. 其它说明详见：“商品明细说明
  private String operator_id;//商户操作员编号
  private String store_id;//商户门店编号
  private String terminal_id;//商户机具终端编号
  private ExtendParams extend_params;//业务扩展参数
  //该笔订单允许的最晚付款时间，逾期将关闭交易。
  //取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。
  private String timeout_express = "90m";
  public String getOut_trade_no()
  {
    return out_trade_no;
  }
  public void setOut_trade_no(String out_trade_no)
  {
    this.out_trade_no = out_trade_no;
  }
  public String getSeller_id()
  {
    return seller_id;
  }
  public void setSeller_id(String seller_id)
  {
    this.seller_id = seller_id;
  }
  public Double getTotal_amount()
  {
    return total_amount;
  }
  public void setTotal_amount(Double total_amount)
  {
    this.total_amount = total_amount;
  }
  public Double getDiscountable_amount()
  {
    return discountable_amount;
  }
  public void setDiscountable_amount(Double discountable_amount)
  {
    this.discountable_amount = discountable_amount;
  }
  public String getSubject()
  {
    return subject;
  }
  public void setSubject(String subject)
  {
    this.subject = subject;
  }
  public String getBody()
  {
    return body;
  }
  public void setBody(String body)
  {
    this.body = body;
  }
  public String getBuyer_id()
  {
    return buyer_id;
  }
  public void setBuyer_id(String buyer_id)
  {
    this.buyer_id = buyer_id;
  }
  public List<AlGoodsDetail> getGoods_detail()
  {
    return goods_detail;
  }
  public void setGoods_detail(List<AlGoodsDetail> goods_detail)
  {
    this.goods_detail = goods_detail;
  }
  public String getOperator_id()
  {
    return operator_id;
  }
  public void setOperator_id(String operator_id)
  {
    this.operator_id = operator_id;
  }
  public String getStore_id()
  {
    return store_id;
  }
  public void setStore_id(String store_id)
  {
    this.store_id = store_id;
  }
  public String getTerminal_id()
  {
    return terminal_id;
  }
  public void setTerminal_id(String terminal_id)
  {
    this.terminal_id = terminal_id;
  }
  public ExtendParams getExtend_params()
  {
    return extend_params;
  }
  public void setExtend_params(ExtendParams extend_params)
  {
    this.extend_params = extend_params;
  }
  public String getTimeout_express()
  {
    return timeout_express;
  }
  public void setTimeout_express(String timeout_express)
  {
    this.timeout_express = timeout_express;
  }
  
}
