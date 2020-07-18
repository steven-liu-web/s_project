package com.maket.vo;

public class ResponseEntity {
	private boolean success;
	private Object data;
	private String msg;
	
	public ResponseEntity(Object obj) {
		this.data = obj;
	}
	
	public static ResponseEntity ok(Object data) {
		return new ResponseEntity(data);
	}
	
	public static ResponseEntity fail(String msg) {
		return new ResponseEntity(msg);
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
