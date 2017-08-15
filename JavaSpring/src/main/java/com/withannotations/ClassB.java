package com.withannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * by default bean name will be class name with first lower case (in my example name will be classB)
 * classB name was used in MyMain to get bean
 * Spring is able to find this component class thanks to component-scan in xml
 * do set different name for a bean set value property!
 */
//@Component(value = "val")
@Component()
public class ClassB {
	
	private ClassA myA;
	
	//constructor based DI
	@Autowired
	public ClassB(ClassA myA) {
		this.myA = myA;
	}

	public ClassA getMyA() {
		return myA;
	}

	public void setMyA(ClassA myA) {
		this.myA = myA;
	}
	
	public String msgFromA(){
		return myA.getMsg();
	}

}
