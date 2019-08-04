package com.codefountain.spring.core.javaconfig.collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {

    @Bean(name = "Laptop")
    public Product product1(){
        return new Product("1", "Laptop");
    }

    @Bean(name = "Bike")
    public Product product2(){
        return new Product("2", "Bike");
    }

    @Bean(name = "Car")
    public Product product3(){
        return new Product("3", "Car");
    }
    @Bean(name = "Mobile")
    public Product product4(){
        return new Product("4", "Mobile");
    }

    @Bean
    public ProductViewer productViewer(){
        return new ProductViewer();
    }

}
