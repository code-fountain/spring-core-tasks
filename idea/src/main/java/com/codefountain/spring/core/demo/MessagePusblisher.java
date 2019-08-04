package com.codefountain.spring.core.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *  Message Publisher Class
 */
@Component
public class MessagePusblisher {//implements ApplicationEventPublisherAware {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
    private static Map<Integer,String> messages = new HashMap<>();
    static{
        messages.put(1, "Butterflies taste with their hind feet");
        messages.put(2, "A group of crows is called murder");
        messages.put(3, "Tomato sauce was sold in the 1800's as medicine");
        messages.put(4, "A donkey will sink in quicksand, but a mule won't");
        messages.put(5, "A lion in the wild, usually makes no more than 20 kills a year");

    }
   /* @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }*/

    public void publishMessage(){

        new SimpleAsyncTaskExecutor().execute( () -> {
            for (int i = 0; i < 5; i++) {
                try{
                    int id = new Random().nextInt(5);
                    MessageEvent messageEvent = new MessageEvent(messages.get(++id));
                    applicationEventPublisher.publishEvent(messageEvent);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}
