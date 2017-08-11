package com.noannotations;

public class HelloWorld {
	
	private String msg;
	private String text;
	
	public HelloWorld(String text){
		this.text = text;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	//default methods
	public void init(){
		System.out.println("bean init");
	}
	public void destroy(){
		System.out.println("bean destory");
	}

}
