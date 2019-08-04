package com.codefountain.spring.core.beanimport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-artist.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-innerbean.xml");
		System.out.println(applicationContext.getBean(Artist.class));
	}
}
