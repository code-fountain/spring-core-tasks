package com.codefountain.spring.core.javaconfig.depends.on;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class Config {

    @Bean
    @DependsOn({"init"})
    public Initialization initialization(){
        return new Initialization();
    }

    @Bean
    public Init init(){
        return new Init();
    }
}
