package com.codefountain.spring.core.aware;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class EnvironmentManager implements EnvironmentAware{

	private Environment environment;
	
	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
	
	public void printEnvironment() {
		System.out.println(environment.getProperty("name"));
	}

}
