package com.codefountain.spring.core.applicationcontext;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-song.xml", 
				"applicationContext-album.xml");
		System.out.println(applicationContext.getBean(Song.class));
		System.out.println(applicationContext.getBean(Album.class));
		
		System.out.println(applicationContext.getId());
		System.out.println(applicationContext.getApplicationName());
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
		System.out.println(applicationContext.getBeanDefinitionCount());
	}
}
