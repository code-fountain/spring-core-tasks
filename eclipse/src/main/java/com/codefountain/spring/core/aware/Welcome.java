package com.codefountain.spring.core.aware;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class Welcome implements MessageSourceAware {
	
	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println(messageSource.getMessage("welcome", null, new Locale("hi", "IN")));
	}
	

}
