package com.jdevautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ByConstExample {
	
	Employee emp;

	ByConstExample(){
		System.out.println("default constructor - in ByConstExample");
	}
	
	/*
	 * annotation on filed or setter is the same as autowire="constructor"
	 * add required = false to avoid thread exception
	 */	
	@Autowired(required = false)
	ByConstExample(Employee emp){
		this.emp= emp;
		System.out.println("constructor - in ByConstExample");
	}

	public Employee getEmp() {
		return emp;
	}

}
