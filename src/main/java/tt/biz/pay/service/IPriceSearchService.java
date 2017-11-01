package tt.biz.pay.service;

import tt.biz.pay.model.CommonDTO;
import tt.biz.pay.model.StockVO;

public interface IPriceSearchService
{
  /**
   * 
   * @Title: getSKUPrice   
   * @Description: TODO(获取每款价格数据量)   
   * @param: @param epcs
   * @param: @return      
   * @return: List<StockEx>      
   * @throws
   */
  public StockVO getSKUPrice(CommonDTO dto);
}
