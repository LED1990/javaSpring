package com.noannotationsDI;

public class DependentSetter {
	/*
	 * DI via setter
	 * XML configuration
	 */
	private Independent indep;
	public DependentSetter(){
		System.out.println("DependantSetter constructor");
	}
	
	public Independent getIndep() {
		return indep;
	}
	public void setIndep(Independent indep) {
		this.indep = indep;
	}
	
	public void displayMsgFromIndep() {
		System.out.println("DI setters "+indep.getMsg());
	}

}
