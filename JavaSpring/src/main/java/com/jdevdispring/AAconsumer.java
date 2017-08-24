package com.jdevdispring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//u don't need @Component if bean is registered in XML
@Component(value = "ac")
public class AAconsumer {
	
	private AAemailService aae = null;
	
	/*
	 * also setter or constructor DI is available
	 */

	@Autowired()
	public AAconsumer(@Qualifier("aaes")AAemailService aae) {
		this.aae = aae;
	}
	
	public AAemailService getAae() {
		return aae;
	}
	//@Autowired
	public void setAae(AAemailService aae) {
		this.aae = aae;
	}
	
	public void displayMessage(String msg, String rec){
		this.aae.sendMessage(msg, rec);
	}
	
	
	

}
