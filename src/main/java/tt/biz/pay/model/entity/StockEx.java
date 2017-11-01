package tt.biz.pay.model.entity;
import java.io.Serializable;
import java.util.List;

public class StockEx extends Stock implements Serializable {

	private List<String> tags;

	private List<Stock> stockItems;

	private Long diffCount; // 差异数量

	private Long bookQty; // 账面数量

	private String classifyName;

	private String parentClassifyName;

	private String warehouseName;

	private String storageZoneName;

	private String storageLocationName;

	private String storageLocationNum;

	private Integer count;

	private Long qty;// 实际数量
	
	private Long saleQty;// 已销售数量

	private Integer limit;

	private Integer start;

	private boolean indateFlag;

	public Long getBookQty() {
		return bookQty;
	}

	public void setBookQty(Long bookQty) {
		this.bookQty = bookQty;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<Stock> getStockItems() {
		return stockItems;
	}

	public void setStockItems(List<Stock> stockItems) {
		this.stockItems = stockItems;
	}

	public Long getDiffCount() {
		return diffCount;
	}

	public void setDiffCount(Long diffCount) {
		this.diffCount = diffCount;
	}

	/**
	 * @Title: getClassifyName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getClassifyName() {
		return classifyName;
	}

	/**
	 * @Title: getParentClassifyName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getParentClassifyName() {
		return parentClassifyName;
	}

	/**
	 * @Title: getWarehouseName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getWarehouseName() {
		return warehouseName;
	}

	/**
	 * @Title: getStorageZoneName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getStorageZoneName() {
		return storageZoneName;
	}

	/**
	 * @Title: getStorageLocationName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getStorageLocationName() {
		return storageLocationName;
	}

	/**
	 * @Title: getStorageLocationNum <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getStorageLocationNum() {
		return storageLocationNum;
	}

	/**
	 * @Title: setClassifyName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}

	/**
	 * @Title: setParentClassifyName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setParentClassifyName(String parentClassifyName) {
		this.parentClassifyName = parentClassifyName;
	}

	/**
	 * @Title: setWarehouseName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	/**
	 * @Title: setStorageZoneName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setStorageZoneName(String storageZoneName) {
		this.storageZoneName = storageZoneName;
	}

	/**
	 * @Title: setStorageLocationName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setStorageLocationName(String storageLocationName) {
		this.storageLocationName = storageLocationName;
	}

	/**
	 * @Title: setStorageLocationNum <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setStorageLocationNum(String storageLocationNum) {
		this.storageLocationNum = storageLocationNum;
	}

	/**
	 * @Title: getCount <BR>
	 * @Description: please write your description <BR>
	 * @return: Integer <BR>
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * @Title: setCount <BR>
	 * @Description: please write your description <BR>
	 * @return: Integer <BR>
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	public Long getQty() {
		return qty;
	}

	public void setQty(Long qty) {
		this.qty = qty;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public boolean isIndateFlag() {
		return indateFlag;
	}

	public void setIndateFlag(boolean indateFlag) {
		this.indateFlag = indateFlag;
	}

  public Long getSaleQty()
  {
    return saleQty;
  }

  public void setSaleQty(Long saleQty)
  {
    this.saleQty = saleQty;
  }

}