package com.jdevdi;

/*
 * this clsass implements contract (Interface)
 */
public class EmailServiceImpl implements MessageService {

	public void sendMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("Email "+msg+" Reciver: "+rec);		
	}

}
