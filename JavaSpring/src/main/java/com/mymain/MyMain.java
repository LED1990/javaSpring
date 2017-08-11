package com.mymain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.noannotations.*;
import com.noannotationsDI.*;
import com.withannotations.*;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * first create context, 
		 * ClassPath... loads beans from configuration file
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("myspringConfig.xml");
		/*
		 * second, use context to get bean (getBean(id of bean from configuration file))
		 * cast object to proper class and now I can use this object
		 */
		HelloWorld hw = (HelloWorld) context.getBean("helloworld");
		System.out.println("Hello world, no annotations bean: "+hw.getMsg());
		System.out.println("Hello world, no annotations bean: "+hw.getText());
		
		/*
		 * inheritance example
		 * I dont have to  create parent object to use child object
		 */
		ParentBean pt = (ParentBean) context.getBean("pt");
		System.out.println("PARENT: "+pt.getVal1());
		System.out.println("PARENT: "+pt.getVal2());
		ChildBean ch = (ChildBean) context.getBean("ch");
		System.out.println("CHILD: "+ch.getVal1());
		System.out.println("CHILD: "+ch.getVal2());
		System.out.println("CHILD: "+ch.getVal3());
		/*
		 * example use of abstract parent class
		 * see XML file
		 */
		ChildBeanAbstract cba = (ChildBeanAbstract) context.getBean("ch2");
		System.out.println("CHILD abstract: "+cba.getChildField());
		System.out.println("CHILD abstract: "+cba.getPro1());
		System.out.println("CHILD abstract: "+cba.getPro2());
		/*
		 * DI with XML configuration
		 */
		Dependent dep = (Dependent) context.getBean("dep");		
		Dependent dep2 = (Dependent) context.getBean("dep2");
		System.out.println("DEP : "+dep2.getMsg1());
		dep2.displayMsgFromIndep();
		
		DependentSetter dep3 = (DependentSetter) context.getBean("dep3");
		dep3.displayMsgFromIndep();
		/*
		 * collections example
		 * XML configuration
		 */
		CollectionsExample cex = (CollectionsExample) context.getBean("col");
		cex.getExampleList();
		cex.getExampleMap();
		cex.getExampleProp();
		cex.getExampleSet();
		/*
		 * Spring configuration with annotations
		 */
		
		// SPRAWDè CZY MOØNA DWA RAZY TWORZY∆ KONTEX CZY NIE LEPIEJ DODA∆ ANNOTACJE DO JUZ ISTNIEJACEGO
		ApplicationContext context2 = new ClassPathXmlApplicationContext("myspringConfigAnnotations.xml");
		ReqiredExample req = (ReqiredExample) context2.getBean("req");
		System.out.println(req.getVal1());
		System.out.println(req.getVal2());
	}

}
