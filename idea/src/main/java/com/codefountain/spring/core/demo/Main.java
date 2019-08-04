package com.codefountain.spring.core.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception{
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EventConfiguration.class);
        //applicationContext.refresh();
        applicationContext.getBean(MessagePusblisher.class).publishMessage();
        Thread.sleep(10000);
        applicationContext.close();
    }
}
