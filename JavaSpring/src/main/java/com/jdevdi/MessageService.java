package com.jdevdi;

/*
 * any service (like sending message, receiving data etc.) should be written as Interfaces or abstarc classes
 * They should be contracts for implementing classes
 */
public interface MessageService {
	
	void sendMessage(String msg, String rec);
	
}
