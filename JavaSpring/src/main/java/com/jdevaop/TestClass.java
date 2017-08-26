package com.jdevaop;

public class TestClass {
	
	private String testVal;

	public String getTestVal() {
		return testVal;
	}

	public void setTestVal(String testVal) {
		this.testVal = testVal;
	}
	public String exampleMethod(String txt, String txt2){
		return "example Method in TestClass.class and passed arg. value: "+txt;
	}
	
	public void throwException(){
		throw new RuntimeException("test exception :)");
	}

}
