package tt.biz.pay.model;

public interface DreamStatus
{

    public final static String SUCCESS = "SUCCESS";

    public final static String FAIL = "FAIL";
    
    public final static String CREATED = "CREATED";
    
    public final static String WX = "WX";
    
    public final static String AL = "AL";
    
    public final static String SALE = "Sale";
    
    public final static String IN = "In";
    
    /** 支付宝交易状态 */
    public interface AliPayStatus {
    	/** 交易创建，等待买家付款 */
    	public final static String WAIT_BUYER_PAY = "WAIT_BUYER_PAY";
    	
    	/** 未付款交易超时关闭，或支付完成后全额退款 */
    	public final static String TRADE_CLOSED = "TRADE_CLOSED";
    	
    	/** 交易支付成功 */
    	public final static String TRADE_SUCCESS = "TRADE_SUCCESS";
    	
    	/** 交易结束，不可退款 */
    	public final static String TRADE_FINISHED = "TRADE_FINISHED";
    	
    	/** 系统错误 */
    	public final static String ACQ_SYSTEM_ERROR = "ACQ.SYSTEM_ERROR";
    	
    	/** 参数无效 */
    	public final static String ACQ_INVALID_PARAMETER = "ACQ.INVALID_PARAMETER";
    	
    	/** 查询的交易不存在 */
    	public final static String ACQ_TRADE_NOT_EXIST = "ACQ.TRADE_NOT_EXIST";
    }
    
    /** 微信交易状态 */
    public interface WXPayStatus {
    	
    	/**微信交易状态查询业务错误码状态*/
    	/** 此交易订单号不存在*/
    	public final static String ORDER_NOT_EXIST = "ORDERNOTEXIST";
    	
    	/** 系统异常，请重新查询*/
    	public final static String SYSTEM_ERROR = "SYSTEMERROR";
    	
    	/**微信交易状态*/
    	/** 订单支付成功*/
    	public final static String SUCCESS = "SUCCESS";
    	
    	/** 订单转入退款 */
    	public final static String REFUND = "REFUND";
    	
    	/** 订单尚未支付 */
    	public final static String NOTPAY = "NOTPAY";
    	
    	/** 订单已关闭 */
    	public final static String CLOSED = "CLOSED";
    	
    	/**该交易已撤销（刷卡支付）*/
    	public final static String REVOKED = "REVOKED";
    	
    	/** 用户支付中 */
    	public final static String USERPAYING = "USERPAYING";
    	
    	/** 该订单支付失败(其他原因，如银行返回失败) */
    	public final static String PAYERROR = "PAYERROR";
    }
}
