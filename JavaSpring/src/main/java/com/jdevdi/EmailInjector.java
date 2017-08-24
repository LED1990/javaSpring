package com.jdevdi;

public class EmailInjector implements MessageServiceInjector {

	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		return new MyConsumerClass(new EmailServiceImpl());
	}

}
