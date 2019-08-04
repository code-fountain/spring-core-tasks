package com.codefountain.spring.core.javaconfig.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {

    @Bean
    public Product product(){
        Product product = new Product();
        product.setProductId("A-456");
        product.setProductDesc("Laptop");
        return product;
    }

    @Bean
    public Address address(){
        return new Address("Unit 87", "George St");
    }
}
