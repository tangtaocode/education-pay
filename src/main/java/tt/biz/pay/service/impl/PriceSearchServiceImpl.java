package tt.biz.pay.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tt.biz.pay.model.CommonDTO;
import tt.biz.pay.model.StockVO;
import tt.biz.pay.model.entity.StockEx;
import tt.biz.pay.service.IPriceSearchService;
import tt.biz.pay.utils.StockUtil;

@Service
@Transactional
public class PriceSearchServiceImpl implements IPriceSearchService {
	private static Logger logger = Logger.getLogger(PriceSearchServiceImpl.class);

	@Override
	public StockVO getSKUPrice(CommonDTO dto) {
		List<StockEx> stocks = new ArrayList<StockEx>();
		List<StockEx> allstocks = new ArrayList<StockEx>();
		StockVO revalue = new StockVO();
		revalue.setAllListStock(allstocks);
		stocks = StockUtil.groupBySku(allstocks);
		BigDecimal price = new BigDecimal("0.00");
		String qty = "0";
		BigDecimal price01 = null;
		for (StockEx stock : stocks) {
		  
			if (stock.getSaleQty() != null && stock.getSaleQty() > 0) {
				qty = String.valueOf(stock.getQty() - stock.getSaleQty());
			} else {
				qty = String.valueOf(stock.getQty());
			}
			price01 = stock.getPrice01();
			price = price.add(price01.multiply(new BigDecimal(qty)));
		}
		// revalue.setTotalAmt(price.doubleValue());
		revalue.setTotalAmt(0.01D);
		revalue.setTotalDisAmt(0.0);
	revalue.setListStock(stocks);
	return revalue;
	}

}
