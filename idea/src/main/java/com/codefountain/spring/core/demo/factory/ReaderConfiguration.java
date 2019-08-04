package com.codefountain.spring.core.demo.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReaderConfiguration {

    @Bean
    public Reader fileReader(){
        return ReaderFactory.getReader(ReaderType.FILE_READER);
    }

    @Bean
    public Reader socketReader(){
        return ReaderFactory.getReader(ReaderType.SOCKET_READER);
    }

    @Bean
    public Reader dbReader(){
        return ReaderFactory.getReader(ReaderType.DB_REDAER);
    }
}
