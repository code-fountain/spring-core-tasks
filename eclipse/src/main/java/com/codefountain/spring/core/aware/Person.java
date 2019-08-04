package com.codefountain.spring.core.aware;

import org.springframework.beans.factory.BeanNameAware;

public class Person implements BeanNameAware {

	String beanName;
	
	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	@Override
	public String toString() {
		return "Person [beanName=" + beanName + "]";
	}
}
