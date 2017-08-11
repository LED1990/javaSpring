package com.withannotations;

import org.springframework.beans.factory.annotation.Required;

public class ReqiredExample {
	private String val1;
	private String val2;
	
	public String getVal1() {
		return val1;
	}
	@Required
	public void setVal1(String val1) {
		this.val1 = val1;
	}
	public String getVal2() {
		return val2;
	}
	@Required
	public void setVal2(String val2) {
		this.val2 = val2;
	}
	
	
}
