package com.codefountain.spring.core.javaconfig.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProductConfiguration.class);
        applicationContext.getBean(ProductViewer.class).viewProducts();
    }
}
