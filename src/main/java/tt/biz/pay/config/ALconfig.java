package tt.biz.pay.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ALconfig
{
  @Value("${ali_appID}")
  private String appID;
  @Value("${ali_order_request_url}")
  private String order_request_url;
  @Value("${ali_private_key}")
  private String private_key;
  @Value("${ali_public_key}")
  private String public_key;
  @Value("${ali_self_public_key}")
  private String self_public_key;
  @Value("${ali_secret_type}")
  private String secret_type;
  @Value("${ali_content_type}")
  private String content_type;
  @Value("${ali_charset}")
  private String charset;
  @Value("${ali_notify_url}")
  private String notify_url;
  @Value("${ali_seller_id}")
  private String seller_id;
  public String getAppID()
  {
    return appID;
  }
  public void setAppID(String appID)
  {
    this.appID = appID;
  }
  public String getOrder_request_url()
  {
    return order_request_url;
  }
  public void setOrder_request_url(String order_request_url)
  {
    this.order_request_url = order_request_url;
  }
  public String getPrivate_key()
  {
    return private_key;
  }
  public void setPrivate_key(String private_key)
  {
    this.private_key = private_key;
  }
  public String getPublic_key()
  {
    return public_key;
  }
  public void setPublic_key(String public_key)
  {
    this.public_key = public_key;
  }
  public String getSecret_type()
  {
    return secret_type;
  }
  public void setSecret_type(String secret_type)
  {
    this.secret_type = secret_type;
  }
  public String getContent_type()
  {
    return content_type;
  }
  public void setContent_type(String content_type)
  {
    this.content_type = content_type;
  }
  public String getCharset()
  {
    return charset;
  }
  public void setCharset(String charset)
  {
    this.charset = charset;
  }
  public String getNotify_url()
  {
    return notify_url;
  }
  public void setNotify_url(String notify_url)
  {
    this.notify_url = notify_url;
  }
  public String getSeller_id()
  {
    return seller_id;
  }
  public void setSeller_id(String seller_id)
  {
    this.seller_id = seller_id;
  }
  public String getSelf_public_key()
  {
    return self_public_key;
  }
  public void setSelf_public_key(String self_public_key)
  {
    this.self_public_key = self_public_key;
  }
  
}
