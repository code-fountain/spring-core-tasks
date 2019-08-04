package com.codefountain.spring.core.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Album implements ApplicationContextAware{

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Display name: "+applicationContext.getDisplayName());
		System.out.println("Application name: "+applicationContext.getApplicationName());
		System.out.println("Startup date: "+applicationContext.getStartupDate());
	}

}
