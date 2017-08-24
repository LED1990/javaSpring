package com.jdevdispring;

/*
 * this class will use ServiceMessage with Spring DI
 * to configure this class I will use XML file
 */
public class XMLconsumer {

	private ServiceMessage sm = null;

	/*
	 * constructor based DI
	 */

	public XMLconsumer(ServiceMessage sm) {
		this.sm = sm;
	}

	/*
	 * setter based DI is also possible just uncomment setter below
	 */
	/*
	  public ServiceMessage getSm() { return sm; }
	 * 
	 * public void setSm(ServiceMessage sm) { this.sm = sm; }
	 */
	public void displayMessage(String msg, String rec) {
		this.sm.sendMessage(msg, rec);
	}

}
