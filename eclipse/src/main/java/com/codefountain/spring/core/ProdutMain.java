package com.codefountain.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProdutMain {

	public static void main(String[] args) {

		//1. Instantiate the Spring IoC Container
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. Get the bean information from Spring IoC
		
		//Product product = (Product) applicationContext.getBean("product");
		
		Product product = applicationContext.getBean("product2", Product.class);
		
		// 3. Use the bean
		
		System.out.println(product);
	}

}
