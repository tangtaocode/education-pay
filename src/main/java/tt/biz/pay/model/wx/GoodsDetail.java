package tt.biz.pay.model.wx;
/**
 * 
 * @ClassName:  GoodsDetail   
 * @Description:TODO(商品详情)   
 * @author: tt1498
 * @date:   2017年9月8日 下午12:55:57
 */
public class GoodsDetail
{
    private String goods_id;//商品编码
    private String wxpay_goods_id;//微信侧商品编码
    private String goods_name;//商品名称
    private int quantity;//商品数量
    private int price;//商品单价
    public String getGoods_id()
    {
      return goods_id;
    }
    public void setGoods_id(String goods_id)
    {
      this.goods_id = goods_id;
    }
    public String getWxpay_goods_id()
    {
      return wxpay_goods_id;
    }
    public void setWxpay_goods_id(String wxpay_goods_id)
    {
      this.wxpay_goods_id = wxpay_goods_id;
    }
    public String getGoods_name()
    {
      return goods_name;
    }
    public void setGoods_name(String goods_name)
    {
      this.goods_name = goods_name;
    }
    public int getQuantity()
    {
      return quantity;
    }
    public void setQuantity(int quantity)
    {
      this.quantity = quantity;
    }
    public int getPrice()
    {
      return price;
    }
    public void setPrice(int price)
    {
      this.price = price;
    }
}
