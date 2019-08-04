package com.codefountain.spring.core.aware;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AwareConfiguration {

    //@Bean
    public Person john(){
        return new Person();
    }


    //@Bean
    public Person doe(){
        return new Person();
    }

    //@Bean
    public Action action(){
        return new Action();
    }

    //@Bean
    public Album album(){
        return new Album();
    }


    //@Bean
    public Welcome welcome(){
        return new Welcome();
    }

    //@Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("welcome");
        return messageSource;
    }

    //@Bean
    public CustomResourceLoader customResourceLoader(){
        return new CustomResourceLoader();
    }
}
