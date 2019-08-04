package com.codefountain.spring.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class FileContext {

    @PostConstruct
    public void init(){
        System.out.println("File handler is initialized");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("File handler is closed");
    }

    public void readFile(){
        System.out.println("File content is read.");
    }

}
