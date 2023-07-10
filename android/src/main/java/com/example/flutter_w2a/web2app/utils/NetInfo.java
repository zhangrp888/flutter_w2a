package com.huntmobi.web2app.utils;
import com.alibaba.fastjson.annotation.JSONField;

public class NetInfo {
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	@JSONField(name = "code")
	private int code;
	@JSONField(name = "message")
	private String message;
	@JSONField(name = "data")
	private String data;


}
