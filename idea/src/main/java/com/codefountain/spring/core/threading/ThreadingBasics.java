package com.codefountain.spring.core.threading;


import java.util.concurrent.*;

public class ThreadingBasics {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        System.out.println(Thread.currentThread().getName());
        /*Thread t1 = new Thread(new MyRunnable());
        t1.start();*/

       /* Future<Integer> result= Executors.newFixedThreadPool(1).submit(new MyCallable());
        System.out.println(result.get());*/

       /*Executor directExcutor = new DirectExecutor();
       directExcutor.execute(new MyRunnable());*/

        Executor threadPerTaskExcutor = new ThreadPerTask();
        threadPerTaskExcutor.execute(new MyRunnable());
        threadPerTaskExcutor.execute(new MyRunnable());
    }

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i <10 ; i++) {
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

    static class MyCallable implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            int result = 0;
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i <10 ; i++) {
                result+=i;
            }
            return result;
        }
    }

    static class DirectExecutor implements Executor{
        @Override
        public void execute(Runnable command) {
            command.run();
        }
    }

    static class ThreadPerTask implements Executor{
        @Override
        public void execute(Runnable command) {
            Thread th = new Thread(command);
            th.start();
        }
    }
}
