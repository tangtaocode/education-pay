package tt.biz.pay.component;

import org.jboss.logging.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import tt.biz.pay.config.AccessConfig;
import tt.biz.pay.config.RabbitConfig;
import tt.biz.pay.model.CacheObject;
import tt.biz.pay.service.IAccessPushService;
@Component
public class PushFlowReceiver {
  private static Logger logger = Logger.getLogger(PushFlowReceiver.class);
  @Autowired
  private IAccessPushService accessPushService;
  @Autowired
  private AccessConfig accessConfig;
      //@RabbitListener(queues = RabbitConfig.serverInlineQueue)
	  //@RabbitHandler
	  public void process(String json) {
        CacheObject cacheObject = new Gson().fromJson(json, CacheObject.class);
        logger.info("队列serverInlineQueue消费数据："+json);
        if(accessConfig.isAccessPrice()){//是否开启第三方推送
          //推送订单数据给第三方
          accessPushService.pushOrder(cacheObject);
          //当前为会员支付时
          if(null!=cacheObject.getMember()){
            //推送微信小票
            accessPushService.pushWxOrder(cacheObject);
          }
        }
	  }
}
