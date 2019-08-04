package com.codefountain.spring.core.javaconfig.depends.on;

import org.springframework.context.annotation.DependsOn;

public class Initialization {

    public void print(){
        System.out.println(this.getClass().getSimpleName());
    }
}
