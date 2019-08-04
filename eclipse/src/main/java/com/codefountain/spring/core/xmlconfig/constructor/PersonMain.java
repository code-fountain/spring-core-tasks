package com.codefountain.spring.core.xmlconfig.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
	
	public static void main(String[] args) {
	
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-constructor.xml");
		System.out.println(applicationContext.getBean(Person.class));
	}
}
