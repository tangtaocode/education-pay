package tt.biz.pay.controller;

import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import tt.biz.pay.model.CommonDTO;
import tt.biz.pay.model.DreamResponse;
import tt.biz.pay.model.entity.User;
import tt.biz.pay.model.entity.Weixin;
import tt.biz.pay.service.IEducationService;

/**
 * 
 * @ClassName:  EducationController   
 * @Description:TODO(在线教育)   
 * @author: tt1498
 * @date:   2017年11月3日 下午4:26:39
 */
@RestController
@RequestMapping(value="/education")
public class EducationController
{
  @Autowired
  private IEducationService education;
  @ApiOperation(value="添加微信")
  @RequestMapping(value="/addWeixin", method=RequestMethod.POST)
  public DreamResponse addWeixin(Weixin wx)
  {
    return education.addWeixin(wx);
  }
  @ApiOperation(value="用户注册")
  @RequestMapping(value="/addUser", method=RequestMethod.POST)
  public DreamResponse addUser(User user)
  {
    return education.addUser(user);
  }
  @ApiOperation(value="课程列表")
  @RequestMapping(value="/loadCourse", method=RequestMethod.POST)
  public DreamResponse loadCourse(CommonDTO dto)
  {
    return education.loadCourse(dto);
  }
}
