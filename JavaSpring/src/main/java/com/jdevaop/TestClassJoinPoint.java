package com.jdevaop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestClassJoinPoint {
	/*
	 * this advice is triggered when any method with 'example' in method name at the beginning and any argument list is invoked in com.jdevaop package
	 */
	@Before("execution(* com.jdevaop.*.example*(..))")
	public void exampleAdvice(JoinPoint jp){
		/*
		 * when passing JoinPoint object to advice method, I can use it to retrieve name of method which triggered advice
		 * with this object I can also retrieve argument list passed to method which triggered advice
		 */
		System.out.println("Before running advice on method="+jp.toString()); //retrieve name of joinPoint - method which triggered advice	 
		System.out.println("Before running advice passed parameters="+ Arrays.toString(jp.getArgs())); //retrieve name of joinPoint - method which triggered advice	 
		
	}
	/*
	 * args(name1,name2...) can be used to indicate joinpoints with matching parameters (arguments)
	 * expression in the pointcut to be applied to any method that matches the argument pattern
	 * to use those arguments I must use the same names of arguments. See name->name and arg2->arg2
	 */
	@Before("args(name,arg2)")
	public void adviceForArguments(String name, String arg2)//here must be the same parameters names as given above
	{
		System.out.println("String argument passed value: "+name);
	}
	
}
