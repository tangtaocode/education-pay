package tt.biz.pay.model.access;

public class CommonResponseAccess<T>
{
  private String code;//0:成功 -1失败
  private String msg;//提醒
  private T data;//
  public String getCode()
  {
    return code;
  }
  public void setCode(String code)
  {
    this.code = code;
  }
  public String getMsg()
  {
    return msg;
  }
  public void setMsg(String msg)
  {
    this.msg = msg;
  }
  public T getData()
  {
    return data;
  }
  public void setData(T data)
  {
    this.data = data;
  }
  
}
