package com.codefountain.spring.core.property.merge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-collection-merge.xml");
		System.out.println(applicationContext.getBean(EmailDetails.class).getDetails());
	}
}
