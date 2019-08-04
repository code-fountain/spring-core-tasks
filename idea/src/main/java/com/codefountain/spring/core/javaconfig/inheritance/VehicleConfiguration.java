package com.codefountain.spring.core.javaconfig.inheritance;

import com.codefountain.spring.core.javaconfig.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfiguration {

    @Bean
    public Vehicle bike() {
        return new Bike("A-0987", "Honda");
    }

    @Bean
    public Vehicle car(){
        Car car = new Car("C-7G54", "Hundai");
        car.setAirConditioned(true);
        return car;
    }

    @Bean
    public UserRepository userRepository(){
        return new UserRepository();
    }
}
