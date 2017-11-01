package tt.biz.pay.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig
{
  @Value("${spring.rabbitmq.android_exchange}")
  private String androidExchange;
  @Value("${spring.rabbitmq.server_exchange}")
  private String serverExchange;
  public final static String serverInlineQueue = "serverInlineQueue";
  
  /**固定内部通讯队列**/
  @Bean
  public Queue serverInlineQueue() {
      return new Queue("serverInlineQueue");
  }
  /**Android交换机**/
  @Bean
  DirectExchange androidDirectexchange() {
      return new DirectExchange(androidExchange);
  }
  /**内部通讯交换机**/
  @Bean
  DirectExchange inlineDirectexchange() {
      return new DirectExchange(serverExchange);
  }
  @Bean
  public Binding bindingServerExchange(Queue serverInlineQueue) {
    DirectExchange exchangeobj = new  DirectExchange(serverExchange,true,false);
    return BindingBuilder.bind(serverInlineQueue).to(exchangeobj).with(RabbitConfig.serverInlineQueue);
  }

  public String getAndroidExchange()
  {
    return androidExchange;
  }

  public String getServerExchange()
  {
    return serverExchange;
  }
  
}
