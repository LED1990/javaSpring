package com.noannotationsDI;

public class Dependent {
	/*
	 * Di via constructor
	 * XML configuration
	 */

	private Independent indep;
	private String msg1;
	private String msg2;

	public Dependent(Independent indep) {
		this.indep = indep;
		System.out.println("Dependent class constructor1");
	}

	public Dependent(String msg1, String msg2, Independent indep) {
		this.indep = indep;
		this.msg1 = msg1;
		this.msg2 = msg2;
		System.out.println("Dependent class constructor2");
	}

	public String getMsg1() {
		return msg1;
	}

	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}

	public String getMsg2() {
		return msg2;
	}

	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}

	public void displayMsgFromIndep() {
		System.out.println(indep.getMsg());
	}
}
