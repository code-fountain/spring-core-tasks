package com.codefountain.spring.core.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreaPoolBasics {

	
	public static void main(String[] args) {
		
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		ExecutorService singleThExecutorService = Executors.newSingleThreadExecutor();
		ScheduledExecutorService scheduledThreadPoolExecutor = Executors.newScheduledThreadPool(1);
		scheduledThreadPoolExecutor.scheduleAtFixedRate(new MyRunnable(), 5, 2, TimeUnit.SECONDS);
	}
	
	
	static class MyRunnable implements Runnable{

		@Override
		public void run() {
			System.out.println("***********************************");
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println(i);
					//Thread.sleep(2000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
