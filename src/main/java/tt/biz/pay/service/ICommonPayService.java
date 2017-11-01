package tt.biz.pay.service;

import tt.biz.pay.model.DreamResponse;
import tt.biz.pay.model.IPayDTO;

public interface ICommonPayService
{
  /**
   * 
   * @Title: multUnifiedOrder   
   * @Description: TODO(多种方式同时下单)   
   * @param: @param dto
   * @param: @return      
   * @return: DreamResponse      
   * @throws
   */
   public DreamResponse multUnifiedOrder(IPayDTO dto);
   /**   
   * @Title: orderQuery   
   * @Description: TODO(支付订单状态查询)   
   * @param: @param out_trade_no
   * @param: @return      
   * @return: DreamResponse      
   * @throws   
   */ 
  DreamResponse orderQuery(String out_trade_no);
}
