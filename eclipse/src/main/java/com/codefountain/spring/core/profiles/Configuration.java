package com.codefountain.spring.core.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.codefountain.spring.core.profiles")
public class Configuration {

	@Bean
	public ProfileManager profileManager() {
		return new ProfileManager();
	}
}
