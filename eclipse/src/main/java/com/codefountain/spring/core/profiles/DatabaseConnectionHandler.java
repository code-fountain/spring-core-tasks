package com.codefountain.spring.core.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnectionHandler {

	@Autowired
	private DataSourceConfiguration dataSourceConfiguration;
	
	public void init() {
		dataSourceConfiguration.doConfig();
	}
}
