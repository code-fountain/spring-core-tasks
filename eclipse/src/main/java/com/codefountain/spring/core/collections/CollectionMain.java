package com.codefountain.spring.core.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-collection.xml");
		CollectionHolder collectionHolder = applicationContext.getBean(CollectionHolder.class);
		
		System.out.println(collectionHolder.getMyList());
		System.out.println(collectionHolder.getMySet());
		System.out.println(collectionHolder.getMyMap());
		
		System.out.println(collectionHolder.getMyPlayers());
		System.out.println(collectionHolder.getProperties());
		
		System.out.println(collectionHolder.getMyList().getClass().getName());
		System.out.println(collectionHolder.getMySet().getClass().getName());
		System.out.println(collectionHolder.getMyMap().getClass().getName());
		
	}
}
