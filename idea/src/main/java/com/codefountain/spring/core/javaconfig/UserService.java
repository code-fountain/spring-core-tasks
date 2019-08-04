package com.codefountain.spring.core.javaconfig;

import com.codefountain.spring.core.User;
import com.codefountain.spring.core.javaconfig.inheritance.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;


public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void save(){
        Objects.requireNonNull(userRepository);
        System.out.println(userRepository.save());
    }
}
