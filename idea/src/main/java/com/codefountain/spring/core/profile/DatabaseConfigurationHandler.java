package com.codefountain.spring.core.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConfigurationHandler {

    @Autowired
    private DatabaseConfiguration databaseConfiguration;

    public void print(){
        databaseConfiguration.doSetup();
    }
}
