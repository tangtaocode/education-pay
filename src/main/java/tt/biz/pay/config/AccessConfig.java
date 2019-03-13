package tt.biz.pay.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName:  AccessConfig   
 * @Description:TODO(接入第三方接口配置类)   
 * @author: tt1498
 * @date:   2017年9月14日 下午1:19:57
 */
@Component
public class AccessConfig
{
  @Value("${access_price}")
  private boolean accessPrice;//是否启用第三方价格接口查询
  @Value("${access_api_price_search}")
  private String accessApiPriceSearch;//第三方价格查询接口
  @Value("${access_api_order_flow}")
  private String accessApiOrderFlow;//第三方订单推送接口
  @Value("${access_api_weixin_bill}")
  private String accessApiWeixinBill;//第三方微信小票推送接口
  @Value("${access_app_id}")
  private String app_id;//第三方授权id
  @Value("${access_app_secret}")
  private String app_secret;//第三方授权秘钥
  public boolean isAccessPrice()
  {
    return accessPrice;
  }
  public String getAccessApiPriceSearch()
  {
    return accessApiPriceSearch;
  }
  public String getAccessApiOrderFlow()
  {
    return accessApiOrderFlow;
  }
  public String getAccessApiWeixinBill()
  {
    return accessApiWeixinBill;
  }
  public String getApp_id()
  {
    return app_id;
  }
  public String getApp_secret()
  {
    return app_secret;
  }
}
