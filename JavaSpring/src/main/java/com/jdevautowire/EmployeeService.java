package com.jdevautowire;
/*
 * I will inject to this class employee
 * by using autowire
 */
public class EmployeeService {
	
	private Employee emp;
	
	/*
	 * def. constructor
	 * add default constructor explicitly when using autowiring byName or byType
	 */
	
	EmployeeService(){
		System.out.println("default constructor");
	}
	/*
	 * constructor for constructor autowiring
	 */
	EmployeeService(Employee emp){
		System.out.println("Autowiring by constructor");
		this.emp = emp;		
	}
	
	public Employee getEmp() {
		return emp;
	}
	
	/*
	 * to use autowiring by name or by type I need setter method
	 * and default constructor
	 */
	public void setEmp(Employee emp) {
		System.out.println("Setter in EmployeeService.class");
		this.emp = emp;
	}
	
	
	
}
