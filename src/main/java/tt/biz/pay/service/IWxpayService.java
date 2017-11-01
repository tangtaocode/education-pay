package tt.biz.pay.service;

import tt.biz.pay.model.DreamResponse;
import tt.biz.pay.model.IPayDTO;

/**
 * 
 * @ClassName:  IWxpayService   
 * @Description:TODO(微信支付接口)   
 * @author: tt1498
 * @date:   2017年9月7日 下午4:39:54
 */
public interface IWxpayService
{
  /**
   * @throws Exception 
   * @Title: unifiedOrder   
   * @Description: TODO(统一下单接口)   
   * @param: @return      
   * @return: DreamResponse      
   * @throws
   */
  public DreamResponse unifiedOrder(IPayDTO dto);
  /**
   * 
   * @Title: orderQuery   
   * @Description: TODO(查询订单)   
   * @param: @return      
   * @return: DreamResponse      
   * @throws
   */
  public DreamResponse orderQuery(IPayDTO dto);
  /**
   * 
   * @Title: reverse   
   * @Description: TODO(撤销订单)   
   * @param: @return      
   * @return: DreamResponse      
   * @throws
   */
  public DreamResponse reverse(IPayDTO dto);
  /**
   * 
   * @Title: notify   
   * @Description: TODO(通知接口)   
   * @param: @param dto
   * @param: @return      
   * @return: String      
   * @throws
   */
  public String notify(IPayDTO dto);
}
