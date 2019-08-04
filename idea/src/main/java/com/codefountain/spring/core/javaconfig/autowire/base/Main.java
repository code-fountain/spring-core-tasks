package com.codefountain.spring.core.javaconfig.autowire.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserConfiguration.class);
        applicationContext.getBean(UserService.class).save();
    }
}
