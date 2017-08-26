package com.mymain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdevaop.TestClassService;

public class MainAop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("jdevaop.xml");
		/*
		 * AOP examples
		 */
		TestClassService testSer = (TestClassService) context.getBean("tss");
		System.out.println(testSer.getTs().getTestVal());
		System.out.println(testSer.getTs().exampleMethod("hello","again"));
		

	}

}
