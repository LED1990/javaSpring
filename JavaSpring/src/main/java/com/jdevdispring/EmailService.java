package com.jdevdispring;

public class EmailService implements ServiceMessage {

	public void sendMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("Message: "+msg+" to: "+rec);		
	}

}
