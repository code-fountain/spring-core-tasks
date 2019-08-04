package com.codefountain.spring.core.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Main {

	@Autowired
	private ConfigurableEnvironment env;
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		//applicationContext.register(Configuration.class);
		applicationContext.getEnvironment().setActiveProfiles("Dev");
		//applicationContext.getEnvironment().setDefaultProfiles("Dev");
		 applicationContext.scan("com.codefountain.spring.core.profiles");
		 applicationContext.refresh();
		 
		applicationContext.getBean(DatabaseConnectionHandler.class).init();
		
		//applicationContext.getBean(ProfileManager.class).printEnvironments();
		
	}
}
