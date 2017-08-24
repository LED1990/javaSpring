package com.jdevdi;
/*
 * the one who need other object to work
 * also should be interface based
 */
public interface Consumer {
	
	void processMessage(String msg, String rec);	

}
