package tt.biz.pay.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName:  OrderUtil   
 * @Description:TODO(订单工具类)   
 * @author: tt1498
 * @date:   2017年9月8日 上午8:20:06
 */
public class OrderUtil
{
  private static final int DATE = 8;
  private static final int NANO = 15;
  private static final int RANDOM = 9;
  
  public static String getDateStr(){
    SimpleDateFormat dateFormater = new SimpleDateFormat("yyyyMMdd");
    Date date = new Date();
    return getFixStr(dateFormater.format(date),DATE);
  }
  /**
   * 
   * @Title: getNanoTimeStr   
   * @Description: TODO(生成定长的纳秒字符)   
   * @param: @return      
   * @return: String      
   * @throws
   */
  public static String getNanoTimeStr(){
    String nanostr = System.nanoTime()+"";
    return getFixStr(nanostr,NANO);
  }
  /**
   * 
   * @Title: getRandomStr   
   * @Description: TODO(获取定长自由数)   
   * @param: @return      
   * @return: String      
   * @throws
   */
  public static String getRandomStr(){
    String str = "";
    Double random = Math.random();
    str = random.toString().substring(2, 11);
    return getFixStr(str,RANDOM);
  }
  /**
   * 
   * @Title: getFixStr   
   * @Description: TODO(获取定长字符串)   
   * @param: @param str
   * @param: @param fixlength
   * @param: @return      
   * @return: String      
   * @throws
   */
  public static String getFixStr(String str,int fixlength){
    if(str.length()>fixlength){
      return str.substring(str.length()-fixlength, str.length());
    }
    if(str.length()<fixlength){
      int lose = fixlength-str.length();
      String randomstr = "";
      for (int i = 0; i < lose; i++) {
            Double random = Math.random();
            randomstr += random.toString().substring(2, 3);
        }
      return str+randomstr;
    }
    return str;
  }
  /**
   * 
   * @Title: generateOrderNo   
   * @Description: TODO(生成默认32位订单号)   
   * @param: @return      
   * @return: String      
   * @throws
   */
  public static String generateOrderNo(){
    String res = getDateStr()+getNanoTimeStr()+getRandomStr();
    return res;
  }
  /**
   * 
   * @Title: generateOrderNo   
   * @Description: TODO(生成带有自定义后缀订单号)   
   * @param: @param suffix
   * @param: @param counts
   * @param: @return      
   * @return: String
   * @throws
   */
  public static String generateOrderNo(String suffix,int counts){
    String res = getDateStr()+getNanoTimeStr()+getFixStr(getRandomStr(),RANDOM-counts)+suffix;
    return res;
  }
  

  /**   
 * @Title: getOrderByThirdOrder   
 * @Description: TODO(根据传入的订单号,补0生成指定长度的订单号)
 * @param: @param orderNo : 999
 * @param: @param length : 6
 * @param: @return   
 * @return: String 000999     
 * @throws   
 */ 
public static String getOrderByOrderNo(String orderNo,int length) {
	  int oldLength = orderNo.length();
	  int subLength = length - oldLength;
	  if(subLength <= 0) {
		  return orderNo;
	  }
	  
	  StringBuilder newOrderNo = new StringBuilder();
	  for(int i = 0;i < subLength;i++) {
		  newOrderNo.append("0");
	  }
	  return newOrderNo.append(orderNo).toString();
  }
}
