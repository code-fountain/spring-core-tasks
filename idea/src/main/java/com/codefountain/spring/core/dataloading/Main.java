package com.codefountain.spring.core.dataloading;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IOException {


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DataLoadingConfiguration.class);
        System.out.println(applicationContext.getBean(DatabaseConfiguration.class));

        applicationContext.getBean(LogoLoader.class).loadLogo();
    }
}
