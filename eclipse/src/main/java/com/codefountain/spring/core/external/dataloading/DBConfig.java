package com.codefountain.spring.core.external.dataloading;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class DBConfig {

	@Value("${db.username}")
	private String userName;
	
	@Value("${db.password}")
	private String password;
	
	@Value("${db.connectionString}")
	private String connectionString;
	
	@Override
	public String toString() {
		return "DataSourceConfiguration [userName=" + userName + ", password=" + password + ", connectionString="
				+ connectionString + "]";
	}
}
