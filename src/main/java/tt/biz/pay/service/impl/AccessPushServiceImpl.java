package tt.biz.pay.service.impl;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tt.biz.pay.model.CacheObject;
import tt.biz.pay.service.IAccessPushService;

@Service
@Transactional
public class AccessPushServiceImpl implements IAccessPushService {
	private static Logger logger = Logger.getLogger(AccessPushServiceImpl.class);

	@Override
	public void pushOrder(CacheObject pushobj) {
	}

	@Override
	public void pushWxOrder(CacheObject pushobj) {
	}

}
