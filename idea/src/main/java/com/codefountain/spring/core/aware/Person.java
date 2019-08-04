package com.codefountain.spring.core.aware;

import org.springframework.beans.factory.BeanNameAware;

public class Person implements BeanNameAware {

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name "+name);
    }
}
