package com.codefountain.spring.core.threading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.core.task.support.TaskExecutorAdapter;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;

@Component
public class SpringTaskExecutor {

    @Autowired
    private SimpleAsyncTaskExecutor simpleAsyncTaskExecutor;

    @Autowired
    private SyncTaskExecutor syncTaskExecutor;

    @Autowired
    private TaskExecutorAdapter taskExecutorAdapter;

    public void doExecute(Runnable task){
        taskExecutorAdapter.execute(task);
    }

}
