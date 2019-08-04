package com.codefountain.spring.core.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadingBasics {
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		Thread t = new Thread(new MyRunnable());
		t.start();
		
		Future<Integer> futureResult = Executors.newFixedThreadPool(1).submit(new MyCallable());
		System.out.println(futureResult.get());
		
	}
	
	
	static class DirectExecutor implements Executor{

		@Override
		public void execute(Runnable command) {
			command.run();
		}
		
	}
	
	static class ThreadPerTaskExecutor implements Executor{

		@Override
		public void execute(Runnable command) {
			Thread th = new Thread(command);
			th.start();
		}
		
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
	
	static class MyCallable implements Callable<Integer>{

		@Override
		public Integer call() throws Exception {
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				try {
					sum+=i;
					Thread.sleep(2000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			return sum;
		}
	}
	
}


