package com.jdevautowire;

import org.springframework.beans.factory.annotation.Autowired;

public class ByTypeExample {
	
	Employee emp;
	
	ByTypeExample(){
		System.out.println("default constructor - in ByTypeExample");
	}
	public Employee getEmp() {
		return emp;
	}
	
	/*
	 * annotation on filed or setter is the same as autowire="byType"
	 */
	@Autowired
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	

}
