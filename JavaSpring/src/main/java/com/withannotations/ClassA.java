package com.withannotations;

import org.springframework.stereotype.Component;

@Component
public class ClassA {
	
	private String msg = "test msg";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
