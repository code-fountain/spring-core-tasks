package com.codefountain.spring.core.circular.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularMain {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-circular.xml");
		applicationContext.getBean(Department.class);
		
	}
}
