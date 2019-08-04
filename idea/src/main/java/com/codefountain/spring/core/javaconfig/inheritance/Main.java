package com.codefountain.spring.core.javaconfig.inheritance;

import com.codefountain.spring.core.javaconfig.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(VehicleConfiguration.class);
        System.out.println(applicationContext.getBean("bike",Vehicle.class));

        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car.isAirConditioned());

        applicationContext.getBean(UserService.class).save();


    }
}
