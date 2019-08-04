package com.codefountain.spring.core.demo;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener { //implements ApplicationListener<MessageEvent> {

    private static int counter = 1;
    //@Override
    @EventListener
    public void onApplicationEvent(MessageEvent event) {
        System.out.println(event.getMessage());
        try{
            Thread.sleep(100000);
        }
        catch(Exception e){

        }
    }

    @EventListener
    public void onContextCloseEvent(ContextClosedEvent contextClosedEvent){
        System.out.println(counter);
        counter++;
        System.out.println("Context Closed at :"+contextClosedEvent.getTimestamp());
    }


    @EventListener
    public void onContextRefreshEvent(ContextRefreshedEvent contextRefreshEvent){
        System.out.println("Context Refreshed at :"+contextRefreshEvent.getTimestamp());
    }
}

