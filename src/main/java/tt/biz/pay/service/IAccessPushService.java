package tt.biz.pay.service;

import tt.biz.pay.model.CacheObject;

/**
 * 
 * @ClassName:  IAccessPushService   
 * @Description:TODO(接入推送接口)   
 * @author: tt1498
 * @date:   2017年9月15日 下午5:52:13
 */
public interface IAccessPushService
{
    /**
     * 
     * @Title: pushOrder   
     * @Description: TODO(推送订单数据给第三方)   
     * @param: @param pushobj      
     * @return: void      
     * @throws
     */
    public void pushOrder(CacheObject pushobj);
    /**
     * 
     * @Title: pushWxOrder   
     * @Description: TODO(推送微信小票给第三方)   
     * @param: @param pushobj      
     * @return: void      
     * @throws
     */
    public void pushWxOrder(CacheObject pushobj);
}
