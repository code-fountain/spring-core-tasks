package com.codefountain.spring.core.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.codefountain.spring.core.profile")
public class Configuration {

    //@Bean
    public DatabaseConfigurationHandler databaseConfigurationHandler(){
        return new DatabaseConfigurationHandler();
    }
}
