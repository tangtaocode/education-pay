package tt.biz.pay.model.ali;

public class AlGoodsDetail
{
   private String body;
   private String goods_category;
   private String goods_id;
   private String goods_name;
   private Double price;
   private Long quantity;
   private String show_url;
    public String getBody()
    {
      return body;
    }
    public void setBody(String body)
    {
      this.body = body;
    }
    public String getGoods_category()
    {
      return goods_category;
    }
    public void setGoods_category(String goods_category)
    {
      this.goods_category = goods_category;
    }
    public String getGoods_id()
    {
      return goods_id;
    }
    public void setGoods_id(String goods_id)
    {
      this.goods_id = goods_id;
    }
    public String getGoods_name()
    {
      return goods_name;
    }
    public void setGoods_name(String goods_name)
    {
      this.goods_name = goods_name;
    }
    public Double getPrice()
    {
      return price;
    }
    public void setPrice(Double price)
    {
      this.price = price;
    }
    public Long getQuantity()
    {
      return quantity;
    }
    public void setQuantity(Long quantity)
    {
      this.quantity = quantity;
    }
    public String getShow_url()
    {
      return show_url;
    }
    public void setShow_url(String show_url)
    {
      this.show_url = show_url;
    }
}
