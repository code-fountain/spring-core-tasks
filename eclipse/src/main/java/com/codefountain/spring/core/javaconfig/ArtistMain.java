package com.codefountain.spring.core.javaconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArtistMain {

	public static void main(String[] args) {
		
		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
		BeanFactory beanFactory = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
		System.out.println(beanFactory.getBean("MyArtist"));
	}
}
