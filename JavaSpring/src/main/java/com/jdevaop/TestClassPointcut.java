package com.jdevaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestClassPointcut {
	
	@Before("justPointer()")
	public void advice1(){
		System.out.println("POINTCUT example: before 1");
	}
	@Before("justPointer()")
	public void advice2(){
		System.out.println("POINTCUT example: before 2");
	}
	/*
	 * we can decalre pointcut with @Pointcut 
	 * than declare empty method which will be reference for advices
	 * within - reduce range in my example to TestClassService class
	 */
	@Pointcut("within(com.jdevaop.TestClassService)")
	public void justPointer() {
	}
	
}
