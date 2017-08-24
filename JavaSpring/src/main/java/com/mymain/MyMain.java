package com.mymain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.*;
import com.jdevautowire.*;
import com.jdevdi.*;
import com.jdevdispring.*;
import com.noannotations.*;
import com.noannotationsDI.*;
import com.withannotations.*;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * first create context, 
		 * ClassPath... loads beans from configuration file
		 * to one context I can provide multiple XML files!!!
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("myspringConfig.xml","myspringConfigAnnotations.xml","aopconfig.xml");
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
		// SPRAWD CZY MO¯NA DWA RAZY TWORZYÆ KONTEX CZY NIE LEPIEJ DODAÆ ANNOTACJE DO JUZ ISTNIEJACEGO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		//ApplicationContext context2 = new ClassPathXmlApplicationContext("myspringConfigAnnotations.xml");
		//ReqiredExample req = (ReqiredExample) context2.getBean("req");
		ReqiredExample req = (ReqiredExample) context.getBean("req");
		System.out.println(req.getVal1());
		System.out.println(req.getVal2());
		//ClassB myB = (ClassB) context2.getBean("classB");
		ClassB myB = (ClassB) context.getBean("classB");
		System.out.println("annotations with scna component in XML ->"+myB.msgFromA());
		
		/*
		 * AOP testing with XML configuration!
		 */
		//ApplicationContext context3 = new ClassPathXmlApplicationContext("aopconfig.xml");
		//MyBean mb = (MyBean) context3.getBean("forAop");
		MyBean mb = (MyBean) context.getBean("forAop");
		mb.forAnnotations();
		mb.testMethod();
		
		((AbstractApplicationContext) context).close();//close context if not needed
		/*
		 * Dependacy Injection based on JournalDev - no SPRING
		 */
		MessageServiceInjector msi = null;
		Consumer app = null;
		msi = new EmailInjector();
		app = msi.getConsumer();
		app.processMessage("my message", "my@adress");
		/*
		 * DI with Spring - based on journalDev tutorial
		 */
		//first create context and initialize with proper class - below for XML configuration
		ApplicationContext context2 = new ClassPathXmlApplicationContext("jdevdispringConfig.xml","jdevdispringAA.xml","jdevautowiring.xml");
		//now when u have context u can get bean
		XMLconsumer xmlc = (XMLconsumer) context2.getBean("xc");
		xmlc.displayMessage("example email msg", "test@reciver");
	
		AAconsumer ac = (AAconsumer) context2.getBean("ac");
		ac.displayMessage("annotations example", "my@annotations.com");
		
		/*
		 * Autowiring examples
		 * based on XML file
		 */
		//baName
		EmployeeService e1 = (EmployeeService) context2.getBean("byname");
		System.out.println("byName -------> "+ e1.getEmp().getName());
		//byType
		EmployeeService e2 = (EmployeeService) context2.getBean("bytype");
		System.out.println("bytype -------> "+ e2.getEmp().getName());
		//by constructor
		EmployeeService e3 = (EmployeeService) context2.getBean("byconstruct");
		System.out.println("by constructor -------> "+ e3.getEmp().getName());
		
		//examples with @autowire annotation
		ByTypeExample e4 = (ByTypeExample) context2.getBean("type");
		System.out.println("@Autowire by type -------> "+ e4.getEmp().getName());
		ByConstExample e5 = (ByConstExample) context2.getBean("byConstr");
		System.out.println("@Autowire by constructor -------> "+ e5.getEmp().getName());
		
		
		((AbstractApplicationContext) context2).close();//close context if not needed
	}

}
