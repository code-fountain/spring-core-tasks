package com.codefountain.spring.core.aop.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);
        applicationContext.getBean("arithmeticCalculator", BasicCalculator.class).multiplication(2,5);
        //applicationContext.getBean("arithmeticCalculator", BasicCalculator.class).addition(1,8);
        //applicationContext.getBean("arithmeticCalculator", BasicCalculator.class).division(1,0);
    }
}
