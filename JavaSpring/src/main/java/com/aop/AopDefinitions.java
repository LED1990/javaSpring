package com.aop;

public class AopDefinitions {
	
	public void doBefore(){
		System.out.println("I am invoked before in aop");
	}
	public void doAfter(){
		System.out.println("I am invoked after in aop");
	}
	public void doAfterRet(){
		System.out.println("I am invoked after method finishes sucessfully!");
	}
	public void doAround(){
		System.out.println("U spin me round round");
	}

}
