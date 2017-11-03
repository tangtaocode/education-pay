package tt.biz.pay.config;

import org.springframework.stereotype.Component;

//@Configuration
@Component
public class RabbitConfig
{
 // @Value("${spring.rabbitmq.android_exchange}")
  private String androidExchange;
  //@Value("${spring.rabbitmq.server_exchange}")
  private String serverExchange;
  public final static String serverInlineQueue = "serverInlineQueue";
  

  public String getAndroidExchange()
  {
    return androidExchange;
  }

  public String getServerExchange()
  {
    return serverExchange;
  }
  
}
