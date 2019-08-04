package com.codefountain.spring.core.aware;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

import java.util.Locale;
import java.util.concurrent.Executor;

public class Welcome implements MessageSourceAware {
    @Override
    public void setMessageSource(MessageSource messageSource) {
        System.out.println(messageSource.getMessage("welcome", null, new Locale("hi", "IN")));
    }
}
