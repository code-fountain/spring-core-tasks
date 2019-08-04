package com.codefountain.spring.core.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-autowire-byname.xml");
		System.out.println(applicationContext.getBean("person"));
	}
}
