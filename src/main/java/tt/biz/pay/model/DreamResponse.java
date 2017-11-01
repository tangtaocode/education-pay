package tt.biz.pay.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@SuppressWarnings("serial")
public class DreamResponse<T> implements Serializable {

	private String status = DreamStatus.SUCCESS;

	private String code;

	private String msg;

	private int optRzt;

	private Map<String, Object> extData;
	
	private int total = 0;
	
	private List<T> data;
	

	public DreamResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getExtData() {
		return extData;
	}

	public void setExtData(Map<String, Object> extData) {
		this.extData = extData;
	}

	public int getOptRzt() {
		return optRzt;
	}

	public void setOptRzt(int optRzt) {
		this.optRzt = optRzt;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
}
