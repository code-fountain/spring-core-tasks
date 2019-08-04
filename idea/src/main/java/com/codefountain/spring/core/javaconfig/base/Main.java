package com.codefountain.spring.core.javaconfig.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProductConfiguration.class);
        System.out.println(applicationContext.getBean(Product.class));
        System.out.println(applicationContext.getBean(Address.class));
    }
}
