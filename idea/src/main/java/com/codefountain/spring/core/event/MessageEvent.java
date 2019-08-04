package com.codefountain.spring.core.event;

import org.springframework.context.ApplicationEvent;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

public class MessageEvent extends ApplicationEvent {

    public String getMessage() {
        return message;
    }

    private String message;
    private static AtomicInteger messageCounter = new AtomicInteger();

    public MessageEvent(String message) {
        super(message);
        this.message = generateMessage(message);
    }

    private String generateMessage(String message){
        StringBuilder builder = new StringBuilder();
        builder.append("| INFO |")
                .append(Calendar.getInstance().getTime())
                .append(" | ").append(" Message Sequence |")
                .append(messageCounter.getAndIncrement())
                .append("|")
                .append(message);

        return builder.toString();
    }


}
