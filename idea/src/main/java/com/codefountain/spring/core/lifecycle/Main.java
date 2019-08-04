package com.codefountain.spring.core.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(FileConfiguration.class);
        applicationContext.getBean(FileContext.class).readFile();
        applicationContext.close();
    }
}
