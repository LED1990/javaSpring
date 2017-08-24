package com.jdevdispring;

import org.springframework.stereotype.Component;

//u don't need @Component if bean is registered in XML
@Component(value = "aaes")
public class AAemailService implements ServiceMessage {

	public void sendMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("Message: "+msg+" to: "+rec);	
	}

}
