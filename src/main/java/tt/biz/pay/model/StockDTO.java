package tt.biz.pay.model;

import java.util.List;

/**   
 * @ClassName:  StockDTO   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: zy1458
 * @date:   2017年4月2日 下午6:21:53   
 */
public class StockDTO{
   
     private Long assetId;
     private String epc;
     private String name; 
     private String num;
     private String parentName;
     private Long assetClassifyId;    
     private Long sizeId;
     private String specification;
     private String model;
     private String material;    
     private String color;  
     private String batchNum;
     private String year;
     private String month;
     private String startDate;
     private String endDate;
     private String warehouseCode;
     private Long warehouseId; 
     private String status;
     private Long clientId;
     private List<String> tags;
     private List<Long> assetIds; 
     private String barcode;
     
    public String getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getBarcode()
    {
      return barcode;
    }

    public void setBarcode(String barcode)
    {
      this.barcode = barcode;
    }

    /**  
     * @Title:  getAssetId <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public Long getAssetId() {
        return assetId;
    }

    /**  
     * @Title:  setAssetId <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    /**  
     * @Title:  getStatus <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public String getStatus() {
        return status;
    }

    /**  
     * @Title:  setStatus <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**  
     * @Title:  getClientId <BR>  
     * @Description: please write your description <BR>  
     * @return: Long <BR>  
     */
    public Long getClientId() {
        return clientId;
    }

    /**  
     * @Title:  setClientId <BR>  
     * @Description: please write your description <BR>  
     * @return: Long <BR>  
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**  
     * @Title:  getWarehouseId <BR>  
     * @Description: please write your description <BR>  
     * @return: Long <BR>  
     */
    public Long getWarehouseId() {
        return warehouseId;
    }

    /**  
     * @Title:  setWarehouseId <BR>  
     * @Description: please write your description <BR>  
     * @return: Long <BR>  
     */
    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**  
     * @Title:  getName <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public String getName() {
        return name;
    }

    /**  
     * @Title:  getParentName <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public String getParentName() {
        return parentName;
    }

    /**  
     * @Title:  getAssetClassifyId <BR>  
     * @Description: please write your description <BR>  
     * @return: Long <BR>  
     */
    public Long getAssetClassifyId() {
        return assetClassifyId;
    }

    /**  
     * @Title:  getSpecification <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public String getSpecification() {
        return specification;
    }

    /**  
     * @Title:  getModel <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public String getModel() {
        return model;
    }

    /**  
     * @Title:  getMaterial <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public String getMaterial() {
        return material;
    }

    /**  
     * @Title:  getColor <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public String getColor() {
        return color;
    }

    /**  
     * @Title:  getBatchNum <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public String getBatchNum() {
        return batchNum;
    }

    /**  
     * @Title:  getStartDate <BR>  
     * @Description: please write your description <BR>  
     * @return: Date <BR>  
     */
    public String getStartDate() {
        return startDate;
    }

    /**  
     * @Title:  getEndDate <BR>  
     * @Description: please write your description <BR>  
     * @return: Date <BR>  
     */
    public String getEndDate() {
        return endDate;
    }

    /**  
     * @Title:  setName <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public void setName(String name) {
        this.name = name;
    }

    /**  
     * @Title:  setParentName <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**  
     * @Title:  setAssetClassifyId <BR>  
     * @Description: please write your description <BR>  
     * @return: Long <BR>  
     */
    public void setAssetClassifyId(Long assetClassifyId) {
        this.assetClassifyId = assetClassifyId;
    }

    /**  
     * @Title:  setSpecification <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }

    /**  
     * @Title:  setModel <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**  
     * @Title:  setMaterial <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**  
     * @Title:  setColor <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**  
     * @Title:  setBatchNum <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    /**  
     * @Title:  setStartDate <BR>  
     * @Description: please write your description <BR>  
     * @return: Date <BR>  
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**  
     * @Title:  setEndDate <BR>  
     * @Description: please write your description <BR>  
     * @return: Date <BR>  
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public List<String> getTags()
    {
      return tags;
    }

    public void setTags(List<String> tags)
    {
      this.tags = tags;
    }

    /**  
     * @Title:  getNum <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public String getNum() {
        return num;
    }

    /**  
     * @Title:  setNum <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**  
     * @Title:  getEpc <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public String getEpc() {
        return epc;
    }

    /**  
     * @Title:  setEpc <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public void setEpc(String epc) {
        this.epc = epc;
    }

    /**  
     * @Title:  getSizeId <BR>  
     * @Description: please write your description <BR>  
     * @return: Long <BR>  
     */
    public Long getSizeId() {
        return sizeId;
    }

    /**  
     * @Title:  setSizeId <BR>  
     * @Description: please write your description <BR>  
     * @return: Long <BR>  
     */
    public void setSizeId(Long sizeId) {
        this.sizeId = sizeId;
    }

    /**  
     * @Title:  getYear <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public String getYear() {
        return year;
    }

    /**  
     * @Title:  getMonth <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public String getMonth() {
        return month;
    }

    /**  
     * @Title:  setYear <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**  
     * @Title:  setMonth <BR>  
     * @Description: please write your description <BR>  
     * @return: String <BR>  
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**  
     * @Title:  getAssetIds <BR>  
     * @Description: please write your description <BR>  
     * @return: List<Long> <BR>  
     */
    public List<Long> getAssetIds() {
        return assetIds;
    }

    /**  
     * @Title:  setAssetIds <BR>  
     * @Description: please write your description <BR>  
     * @return: List<Long> <BR>  
     */
    public void setAssetIds(List<Long> assetIds) {
        this.assetIds = assetIds;
    }
}
