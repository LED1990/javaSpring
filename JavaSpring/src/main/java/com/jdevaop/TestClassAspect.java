package com.jdevaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestClassAspect {
	
	/*
	 * "execution...." - is a pointuct 
	 * this advice executes when ANY public String getName will be executed
	 */
	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getName()");
	}	
	
	/*
	 * this advice executes when method with 'get' at the beginning in name, without arguments, in package com.jdevaop will execute
	 */
	@Before("execution(* com.jdevaop.*.getTest*())")
	public void getAllAdvice(){
		System.out.println("Service method getter called");
	}

}
