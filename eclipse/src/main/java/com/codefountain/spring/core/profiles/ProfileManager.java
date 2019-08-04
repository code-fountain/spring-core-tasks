package com.codefountain.spring.core.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

@Component
public class ProfileManager {

	@Autowired
	ConfigurableEnvironment configurableEnvironment;
	
	public void printEnvironments() {
		for(String profile : configurableEnvironment.getDefaultProfiles()) {
			System.out.println(profile);
		}
	}
}
