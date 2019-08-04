package com.codefountain.spring.core.aware;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;

public class Main {

	public static void main(String[] args) throws BeansException, IOException {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		StandardEnvironment environment = new StandardEnvironment();
		MutablePropertySources propertySources = environment.getPropertySources();
		Map<String, Object> mapProperty = new HashMap<>();
		mapProperty.put("name", "Code Fountain");
		propertySources.addFirst(new MapPropertySource("custom", mapProperty));
		applicationContext.setEnvironment(environment);
		
		applicationContext.scan("com.codefountain.spring.core.aware");
		applicationContext.refresh();
		
		//System.out.println(applicationContext.getBean("person1", Person.class));
		//System.out.println(applicationContext.getBean("person2", Person.class));
		
		//applicationContext.getBean(Action.class).printBeanFactoryInfo();
		//applicationContext.getBean(Album.class);
		applicationContext.getBean(Welcome.class);
		
		//applicationContext.getBean(CustomResourceLoader.class).doLoad();
		
		applicationContext.getBean(EnvironmentManager.class).printEnvironment();
	}
	
}
