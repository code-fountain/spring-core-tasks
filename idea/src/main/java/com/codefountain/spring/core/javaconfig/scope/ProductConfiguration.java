package com.codefountain.spring.core.javaconfig.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.codefountain.spring.core.javaconfig.scope")
public class ProductConfiguration {

    @Bean
    public Product laptop(){
        return new Product("1", "Laptop");
    }

    @Bean
    public Product mobile(){
        return new Product("2", "Mobile");
    }

    //@Bean
    public Cart shoppingCart(){
        return new Cart();
    }
}
