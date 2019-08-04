package com.codefountain.spring.core.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();


        StandardEnvironment standardEnvironment = new StandardEnvironment();
        MutablePropertySources mutablePropertySources = standardEnvironment.getPropertySources();

        Map<String, Object> map = new HashMap<>();
        map.put("name", "Doe");

        mutablePropertySources.addFirst(new MapPropertySource("custom", map));

        applicationContext.setEnvironment(standardEnvironment);

        applicationContext.scan("com.codefountain.spring.core.aware");
        applicationContext.refresh();



    }
}
