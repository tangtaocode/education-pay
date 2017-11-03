package tt.biz.pay.component;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;
@Component
public class PayMsgSender
{
  private static Logger logger = Logger.getLogger(PayMsgSender.class);
  //@Autowired
  //private AmqpTemplate rabbitTemplate;
  //@Autowired
  //private RabbitConfig rabbitConfig;
  public void sendAndroid(String Queuename,String msg) {
    logger.info("***队列："+Queuename+"  *****消息"+msg);
    //this.rabbitTemplate.convertAndSend(rabbitConfig.getAndroidExchange(),Queuename, msg);
  }
  public void sendServer(String msg) {
    //logger.info("***队列："+rabbitConfig.serverInlineQueue+"  *****消息"+msg);
   // this.rabbitTemplate.convertAndSend(rabbitConfig.getServerExchange(),rabbitConfig.serverInlineQueue, msg);
  }
}
