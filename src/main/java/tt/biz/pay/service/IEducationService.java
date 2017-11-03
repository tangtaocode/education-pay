package tt.biz.pay.service;
/**
 * 
 * @ClassName:  IEducationService   
 * @Description:TODO(在线教育)   
 * @author: tt1498
 * @date:   2017年11月3日 下午4:29:13
 */

import tt.biz.pay.model.CommonDTO;
import tt.biz.pay.model.DreamResponse;
import tt.biz.pay.model.entity.User;
import tt.biz.pay.model.entity.Weixin;

public interface IEducationService
{
  /**
   * 
   * @Title: addWeixin   
   * @Description: TODO(授权微信号)   
   * @param: @param wx
   * @param: @return      
   * @return: DreamResponse      
   * @throws
   */
   public DreamResponse addWeixin(Weixin wx);
   /**
    * 
    * @Title: addUser   
    * @Description: TODO(注册用户)   
    * @param: @param user
    * @param: @return      
    * @return: DreamResponse      
    * @throws
    */
   public DreamResponse addUser(User user);
   /**
    * 
    * @Title: loadCourse   
    * @Description: TODO(显示)   
    * @param: @return      
    * @return: DreamResponse      
    * @throws
    */
   public DreamResponse loadCourse(CommonDTO dto);
}
