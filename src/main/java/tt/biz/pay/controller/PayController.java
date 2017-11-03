package tt.biz.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;
import tt.biz.pay.model.CommonDTO;
import tt.biz.pay.model.DreamResponse;
import tt.biz.pay.model.DreamStatus;
import tt.biz.pay.model.WxPayDTO;
import tt.biz.pay.model.ali.NotifyResponse;
import tt.biz.pay.service.IAlipayService;
import tt.biz.pay.service.ICommonPayService;
import tt.biz.pay.service.IWxpayService;

/**
 * 
 * @ClassName:  PayController   
 * @Description:TODO(支付控制类)   
 * @author: tt1498
 * @date:   2017年9月8日 下午2:33:39
 */
@RestController
@RequestMapping("/pay")
@SuppressWarnings("rawtypes")
public class PayController
{
  @Autowired
  private IWxpayService wxpayService;
  @Autowired
  private IAlipayService alipayService;
  @Autowired
  private ICommonPayService commonPayService;
  /**
   * 
   * @Title: unifiedOrder   
   * @Description: TODO(分类下单接口)   
   * @param: @param dto
   * @return: DreamResponse      
   * @throws
   */
  @ApiOperation(value="支付分类下订单")
  @RequestMapping(value="/unifiedOrder",method=RequestMethod.POST)
  @ResponseBody
  public DreamResponse unifiedOrder(CommonDTO dto){
    if(DreamStatus.AL.equals(DreamStatus.WX)){
      return alipayService.unifiedOrder(dto);
    }else{
      return wxpayService.unifiedOrder(dto);
    }
  }
  /**
   * 
   * @Title: unifiedOrder   
   * @Description: TODO(分类下单接口)   
   * @param: @param dto
   * @return: DreamResponse      
   * @throws
   */
  @ApiIgnore
  @RequestMapping("/multUnifiedOrder")
  @ResponseBody
  public DreamResponse multUnifiedOrder(CommonDTO dto){
    return commonPayService.multUnifiedOrder(dto);
  }
  /**
   * 
   * @Title: wxNotify   
   * @Description: TODO(微信回调地址)   
   * @param: @param dto
   * @return: String      
   * @throws
   */
  @ApiIgnore
  @RequestMapping(value="/wxNotify")
  @ResponseBody
  public String wxNotify(WxPayDTO wxdto){
    return wxpayService.notify(wxdto);
  }
  /**
   * 
   * @Title: alNotify   
   * @Description: TODO(支付宝回调地址)   
   * @param: @param dto
   * @return: String      
   * @throws
   */
  @ApiIgnore
  @RequestMapping("/alNotify")
  @ResponseBody
  public String alNotify(NotifyResponse dto){
    return alipayService.notify(dto);
  }
  /**
   * 
   * @Title: gateway   
   * @Description: TODO(支付宝网关)   
   * @param: @param dto
   * @return: DreamResponse      
   * @throws
   */
  @ApiIgnore
  @RequestMapping("/gateway")
  @ResponseBody
  public void gateway(){
     alipayService.getWay();
  }
  /**   
   * @Title: orderQuery   
   * @Description: TODO(支付订单状态查询)   
   * @param: @param out_trade_no
   * @param: @return      
   * @return: DreamResponse      
   * @throws   
   */ 
  @ApiOperation(value="支付订单查询")
  @RequestMapping(value="/orderQuery",method=RequestMethod.POST)
  @ResponseBody
  public DreamResponse orderQuery(String out_trade_no) {
    return commonPayService.orderQuery(out_trade_no);
  }
}
