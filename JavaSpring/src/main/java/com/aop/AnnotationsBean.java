package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnnotationsBean {
	/*
	 * Pointcut the same as in XML example
	 * method under annotation should be empty and it is signature, 
	 * I think it works as ID... CHECK IT!!
	 */
	@Pointcut("execution(public* com.aop.MyBean.forAnnotations(..))")
	private void justName(){}
	
	/*
	 * advices part
	 */
	@Before("justName()")
	public void doBeforeA(){
		System.out.println("I am invoked before in aop - annotations");
	}
	@After("justName()")
	public void doAfterA(){
		System.out.println("I am invoked after in aop - annotations");
	}
	@AfterReturning("justName()")
	public void doAfterRetA(){
		System.out.println("I am invoked after method finishes sucessfully! - annotations");
	}
	@Around("justName()")
	public void doAroundA(){
		System.out.println("U spin me round round - annotations");
	}
}
