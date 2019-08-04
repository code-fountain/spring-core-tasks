package com.codefountain.spring.core.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Component
public class MessagePublisher {//implements ApplicationEventPublisherAware {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    private static Map<Integer, String> messages = new HashMap<>();

    static{
        messages.put(1, "Sample message 1");
        messages.put(2, "Sample message 2");
        messages.put(3, "Sample message 3");
        messages.put(4, "Sample message 4");
        messages.put(5, "Sample message 5");

    }

  /*  @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }*/

    public void publishMessage(){
        new SimpleAsyncTaskExecutor().execute(() -> {
            try{
                for (int i = 0; i < 5; i++) {
                    int id = new Random().nextInt(5);
                    MessageEvent messageEvent = new MessageEvent(messages.get(++id));
                    DateTimeEvent dateTimeEvent = new DateTimeEvent("Some Event");
                    applicationEventPublisher.publishEvent(messageEvent);
                    applicationEventPublisher.publishEvent(dateTimeEvent);
                    TimeUnit.SECONDS.sleep(2);
                }
            }
            catch (Exception e){

            }

        });

    }
}
