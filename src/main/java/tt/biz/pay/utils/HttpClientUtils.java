package tt.biz.pay.utils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

/* 
 * 利用HttpClient进行post请求的工具类 
 */  
public class HttpClientUtils {  
	public static final String APPLICATION_JSON = "application/json";
	public static final String CONTENT_TYPE_TEXT_JSON = "text/json";
	public static final String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded";
    public static String doPost(String url,String json,String charset){  
        HttpClient httpClient = null;  
        HttpPost httpPost = null;  
        String result = null;  
        try{  
            httpClient = new SSLClient();  
            httpPost = new HttpPost(url);  
            httpPost.addHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON);
            httpPost.setHeader("Accept", APPLICATION_JSON);
            //设置参数  
            StringEntity se = new StringEntity(json,Charset.forName(charset));
            se.setContentType(CONTENT_TYPE_TEXT_JSON);
            se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON));
            httpPost.setEntity(se);
            HttpResponse response = httpClient.execute(httpPost);  
            if(response != null){  
                HttpEntity resEntity = response.getEntity();  
                if(resEntity != null){  
                    result = EntityUtils.toString(resEntity,charset);  
                }  
            }  
        }catch(Exception ex){  
            ex.printStackTrace();  
        }
        return result;  
    }
    
    public static String doBodyPost(String url,Map<String,String> params,String charset,String contentType){  
      HttpClient httpClient = null;  
      HttpPost httpPost = null;  
      String result = null;  
      try{
          httpClient = new SSLClient();  
          httpPost = new HttpPost(url);  
          httpPost.addHeader(HTTP.CONTENT_TYPE, contentType);
          //设置参数  
          List<NameValuePair> formparams = new ArrayList<NameValuePair>();
          Object value = null;
          for(Entry<String,String> enty:params.entrySet()){
              value = enty.getValue();
              if(value instanceof Long){
                formparams.add(new BasicNameValuePair(enty.getKey(),String.valueOf(value))); 
              }else{
                formparams.add(new BasicNameValuePair(enty.getKey(),(String)value)); 
              }
          }
          UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formparams, charset);
          httpPost.setEntity(uefEntity);
          HttpResponse response = httpClient.execute(httpPost);  
          if(response != null){  
              HttpEntity resEntity = response.getEntity();  
              
              if(resEntity != null){  
                  result = EntityUtils.toString(resEntity,charset);  
              }  
          }  
      }catch(Exception ex){  
          ex.printStackTrace();  
      }  
      return result;  
    }
}  