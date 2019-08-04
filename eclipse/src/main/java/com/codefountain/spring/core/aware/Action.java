package com.codefountain.spring.core.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Action implements BeanFactoryAware {

	private BeanFactory beanFactory;
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	
	public void printBeanFactoryInfo() {
		System.out.println(beanFactory.toString());
	}

}
