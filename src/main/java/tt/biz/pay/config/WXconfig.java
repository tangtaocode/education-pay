package tt.biz.pay.config;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import tt.biz.pay.utils.wxsdk.IWXPayDomain;
import tt.biz.pay.utils.wxsdk.WXPayConfig;
import tt.biz.pay.utils.wxsdk.WXPayDomain;

@Component
public class WXconfig extends WXPayConfig {
	@Value("${wx_appID}")
	private String appID;
	@Value("${wx_mchID}")
	private String mchID;
	@Value("${wx_key}")
	private String key;
	@Value("${wx_domain}")
	public String domain;// 支付请求的域名
	@Value("${wx_primaryDomain}")
	private boolean primaryDomain;// 该支付请求域名是否是主域名

	@Override
	protected String getAppID() {
		// TODO Auto-generated method stub
		return appID;
	}

	@Override
	protected String getMchID() {
		// TODO Auto-generated method stub
		return mchID;
	}

	@Override
	protected String getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	public String getDomain() {
		return domain;
	}

	public boolean isPrimaryDomain() {
		return primaryDomain;
	}

	@Override
	protected InputStream getCertStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected IWXPayDomain getWXPayDomain() {
		return new WXPayDomain();
	}
}
