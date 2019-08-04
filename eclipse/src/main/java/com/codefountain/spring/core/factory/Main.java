package com.codefountain.spring.core.factory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ReaderConfiguration.class);
		applicationContext.getBean("fileReader", Reader.class).read();
		applicationContext.getBean("dbReader", Reader.class).read();
		
	}
}
