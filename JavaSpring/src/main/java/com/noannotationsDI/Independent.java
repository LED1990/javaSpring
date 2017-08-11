package com.noannotationsDI;

public class Independent {
	private String msg;
	public Independent(){
		System.out.println("indep class constructor");
	}
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
