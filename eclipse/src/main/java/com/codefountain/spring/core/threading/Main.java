package com.codefountain.spring.core.threading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ThreadConfiguration.class);
		applicationContext.getBean(SpringTaskExecutorDemo.class).execute(new MyRunnable());
		

	}
	
	static class MyRunnable implements Runnable{

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println(i);
					Thread.sleep(2000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
