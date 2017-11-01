package tt.biz.pay.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;

import tt.biz.pay.model.DreamStatus;
import tt.biz.pay.model.GoodVO;
import tt.biz.pay.model.entity.Stock;
import tt.biz.pay.model.entity.StockEx;

public class StockUtil
{
  /**
   * @Title: groupBySku   
   * @Description: TODO(根据sku分组商品)   
   * @param: @param stocks
   * @param: @return      
   * @return: List<StockEx>      
   * @throws
   */
  public static List<StockEx> groupBySku(List<StockEx> stocks) {
    List<StockEx> stockExs = new ArrayList<StockEx>();
    Map<String, StockEx> groupMap = new HashMap<String, StockEx>();
    for (Stock stock : stocks) {
        if (null == groupMap.get(stock.getBarcode())) {
            StockEx stockEx = new StockEx();
            BeanUtils.copyProperties(stock, stockEx);
            List<Stock> s = new ArrayList<Stock>();
            s.add(stock);
            stockEx.setStockItems(s);
            stockEx.setQty(1L);
            stockEx.setSaleQty(0L);
            if(DreamStatus.SALE.equals(stock.getStatus())){
              stockEx.setSaleQty(1L);
            }
            groupMap.put(stock.getBarcode(), stockEx);
        }
        else {
            StockEx stockEx = groupMap.get(stock.getBarcode());
            stockEx.getStockItems().add(stock);
            stockEx.setQty(stockEx.getQty()+1L);
            if(DreamStatus.SALE.equals(stock.getStatus())){
              stockEx.setSaleQty(stockEx.getSaleQty()+1L);
            }
        }
      }
        Iterator it = groupMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            StockEx value = (StockEx)entry.getValue();
            stockExs.add(value);
        }
        return stockExs;
      }
  /**
   * 
   * @Title: filterItem   
   * @Description: TODO(物品分类销售和未销售数据展示)   
   * @param: @param stocks
   * @param: @return      
   * @return: List<GoodVO>      
   * @throws
   */
  public static List<GoodVO> filterItem(List<StockEx> stocks) {
    List<GoodVO> revalue = new ArrayList<GoodVO>();
    GoodVO goods = null;
    GoodVO goodi = null;
        for(StockEx stock :stocks){
            if(stock.getSaleQty()!=null&&stock.getSaleQty()>0){
              goods = new GoodVO();
              BeanUtils.copyProperties(stock, goods);
              goods.setStatus(DreamStatus.SALE);
              goods.setQty(stock.getSaleQty());
              revalue.add(goods);
              if(stock.getQty()>stock.getSaleQty()){
                goodi = goods.copy();
                goodi.setStatus(DreamStatus.IN);
                goodi.setQty(stock.getQty()-stock.getSaleQty());
                revalue.add(goodi);
              }
            }else{
              goods = new GoodVO();
              BeanUtils.copyProperties(stock, goods);
              goods.setStatus(DreamStatus.IN);
              revalue.add(goods);
            }
        }
          return revalue;
      }
}
