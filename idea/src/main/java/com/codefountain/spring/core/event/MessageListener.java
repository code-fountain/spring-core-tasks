package com.codefountain.spring.core.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class MessageListener{ // implements ApplicationListener<MessageEvent> {

    @EventListener
    public void onApplicationEvent(MessageEvent event) {
        System.out.println(event.getMessage());
        try{
            TimeUnit.SECONDS.sleep(2000);
        }
        catch(Exception e){

        }
        //System.out.println(event.getTimestamp());
    }

    @EventListener
    public void onApplicationEvent(DateTimeEvent dateTimeEvent){
        System.out.println(dateTimeEvent.getDateTime());
    }

    @EventListener
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent){
        System.out.println("Context started");
    }

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent){
        System.out.println("Context Refreshed");
    }

    @EventListener
    public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent){
        System.out.println("Context Stopped");
    }

    @EventListener
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent){
        System.out.println("Context Closed");
    }

}
