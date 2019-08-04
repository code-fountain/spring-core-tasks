package com.codefountain.spring.core.dataloading;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class DatabaseConfiguration {

    @Value("${dbuser}")
    private String user;

    @Value("${password}")
    private String password;

    @Value("${url}")
    private String url;

    @Override
    public String toString() {
        return "DatabaseConfiguration{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
