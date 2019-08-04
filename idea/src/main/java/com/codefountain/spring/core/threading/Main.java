package com.codefountain.spring.core.threading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaskExecutorConfiguration.class);
        applicationContext.getBean(SpringTaskExecutor.class).doExecute(new MyRunnable());

    }

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i <5 ; i++) {
                System.out.println(i);
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
