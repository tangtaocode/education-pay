package tt.biz.pay.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tt.biz.pay.mapper.CourseMapper;
import tt.biz.pay.mapper.UserMapper;
import tt.biz.pay.mapper.WeixinMapper;
import tt.biz.pay.model.CommonDTO;
import tt.biz.pay.model.DreamResponse;
import tt.biz.pay.model.DreamStatus;
import tt.biz.pay.model.entity.User;
import tt.biz.pay.model.entity.Weixin;
import tt.biz.pay.service.IEducationService;
@Service
@Transactional
public class EducaionServiceImpl implements IEducationService
{
  @Autowired
  private UserMapper userMapper;
  @Autowired
  private WeixinMapper weixinMapper;
  @Autowired
  private CourseMapper courseMapper;
  @Override
  public DreamResponse addWeixin(Weixin wx)
  {
    DreamResponse<Weixin> revalue = new DreamResponse<Weixin>();
    revalue.setStatus(DreamStatus.SUCCESS);
    wx.setCreateTime(new Date());
    weixinMapper.insertSelective(wx);
    revalue.setSingle(wx);
    return revalue;
  }

  @Override
  public DreamResponse addUser(User user)
  {
    DreamResponse<User> revalue = new DreamResponse<User>();
    revalue.setStatus(DreamStatus.SUCCESS);
    user.setCreateTime(new Date());
    userMapper.insertSelective(user);
    revalue.setSingle(user);
    return revalue;
  }

  @Override
  public DreamResponse loadCourse(CommonDTO dto)
  {
    DreamResponse revalue = new DreamResponse();
    revalue.setStatus(DreamStatus.SUCCESS);
    revalue.setData(courseMapper.loadAll(dto));
    revalue.setTotal(revalue.getData().size());
    return revalue;
  }

}
