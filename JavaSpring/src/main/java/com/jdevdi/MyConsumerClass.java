package com.jdevdi;

/*
 * this class doesnt initialize enything
 * only using MessageService
 */
public class MyConsumerClass implements Consumer {
	
	private MessageService ms = null;
	

	public MyConsumerClass(MessageService ms) {
		this.ms = ms;
	}


	public void processMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		this.ms.sendMessage(msg, rec);
		
	}

}
