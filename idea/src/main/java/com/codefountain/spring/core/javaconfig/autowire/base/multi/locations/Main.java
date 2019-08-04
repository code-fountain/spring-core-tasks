package com.codefountain.spring.core.javaconfig.autowire.base.multi.locations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
        System.out.println(applicationContext.getBean(Artist.class));
    }
}
