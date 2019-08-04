package com.codefountain.spring.core;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Provides CRUD support to the users
 */
public class UserService {

    private UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }

    public void findById(long userId){
        userRepository.findById(userId);
    }

    public void update(User user){
        userRepository.update(user);
    }

    public void delete(long userId){
        userRepository.delete(userId);
    }
}
