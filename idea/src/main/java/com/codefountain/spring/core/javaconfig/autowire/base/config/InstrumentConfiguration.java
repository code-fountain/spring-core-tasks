package com.codefountain.spring.core.javaconfig.autowire.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstrumentConfiguration {

    @Bean
    public Instrument instrument(){
        return new Instrument("Piano");
    }
}
