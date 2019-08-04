package com.codefountain.spring.core.taskexecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class ExecutorDemo {

    public static void main(String[] args) {

        Runnable task = () -> {
            try {
                System.out.println("|INFO| Running by "+Thread.currentThread().getName());
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    Thread.sleep(2000);
                }
            }
            catch(Exception e){
                // Ignore
            }
        };

        new SameThreadTaskExecutor().execute(task);
        new TaskPerThreadTaskExecutor().execute(task);
    }

    /**
     * Custom task executor in the same thread.
     */
    static class SameThreadTaskExecutor implements Executor{
        @Override
        public void execute(Runnable command) {
            command.run();
        }
    }

    /**
     * Creates a new Thread per task
     */
    static class TaskPerThreadTaskExecutor implements Executor{
        @Override
        public void execute(Runnable command){
            Thread t = new Thread(command);
            t.start();
        }
    }
}
