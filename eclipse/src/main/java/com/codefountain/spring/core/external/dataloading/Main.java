package com.codefountain.spring.core.external.dataloading;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws BeansException, IOException {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertyConfiguration.class);
		System.out.println(applicationContext.getBean(DBConfig.class));
		applicationContext.getBean(LogoLoader.class).loadLogo();
		
	}
}
