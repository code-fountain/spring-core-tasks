package com.codefountain.spring.core.javaconfig.autowire.base.component;

import org.springframework.stereotype.Component;

@Component
public class Product {

    private int id;

    public Product(int id) {
        this.id = id;
    }
}
