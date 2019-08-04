package com.codefountain.spring.core.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Dev")
public class DevDataSourceConfiguration implements DataSourceConfiguration{

	@Override
	public void doConfig() {
		System.out.println("Datasource configuration configired in Dev environment");
	}

	
}
