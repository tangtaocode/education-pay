package tt.biz.pay.model;

public interface MessageType
{
    public final static String PAY_OVER = "1";//支付完成消息
    public final static String SCAN_MEMBER = "2";//会员扫码完成消息
    public final static String PUSH_MESS = "3";//订单及小票推送消息
}
