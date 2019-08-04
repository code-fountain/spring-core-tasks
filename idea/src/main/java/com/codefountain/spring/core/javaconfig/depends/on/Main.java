package com.codefountain.spring.core.javaconfig.depends.on;

import com.codefountain.spring.core.javaconfig.scope.Cart;
import com.codefountain.spring.core.javaconfig.scope.Product;
import com.codefountain.spring.core.javaconfig.scope.ProductConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        applicationContext.getBean(Initialization.class).print();

    }
}
