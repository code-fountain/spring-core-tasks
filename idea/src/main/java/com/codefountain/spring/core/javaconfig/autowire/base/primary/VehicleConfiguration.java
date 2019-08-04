package com.codefountain.spring.core.javaconfig.autowire.base.primary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class VehicleConfiguration {

    @Bean
    public Vehicle bike(){
        return new Bike();
    }

    @Bean
    public Vehicle car(){
        return new Car();
    }

    @Bean
    public Person person(){
        return new Person();
    }
}
