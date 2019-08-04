package com.codefountain.spring.core.aware;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AwareBeanConfiguration {

	@Bean
	public Person person1() {
		return new Person();
	}
	
	@Bean
	public Person person2() {	
		return new Person();
	}
	
	@Bean
	public Action action1() {
		return new Action();
	}
	
	//@Bean
	public Album album1() {
		return new Album();
	}
	
	@Bean
	public Welcome welcome1() {
		return new Welcome();
	}
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("welcome");
		return messageSource;
	}
	
	//@Bean
	public CustomResourceLoader customResourceLoader() {
		return new CustomResourceLoader();
	}
	
	@Bean
	public EnvironmentManager environmentManager() {
		return new EnvironmentManager();
	}
}
