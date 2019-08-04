package com.codefountain.spring.core.event;

import org.springframework.context.ApplicationEvent;

import java.util.Calendar;
import java.util.Date;

public class DateTimeEvent extends ApplicationEvent {

    public Date getDateTime() {
        return dateTime;
    }

    private Date dateTime;

    public DateTimeEvent(Object source) {
        super(source);
        this.dateTime = Calendar.getInstance().getTime();
    }


}
