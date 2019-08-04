package com.codefountain.spring.core.factory;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReaderConfiguration {

	@Bean
	public ReaderFactory readerFactory() {
		Map<ReaderType, Reader> readers = new LinkedHashMap<>();
		readers.put(ReaderType.FILE_READER, new FileReader());
		readers.put(ReaderType.DB_READER, new DBReader());
		
		ReaderFactory readerFactory = new ReaderFactory();
		readerFactory.setReaders(readers);
		return readerFactory;
	} 
	
	@Bean
	public Reader fileReader() {
		return readerFactory().getReader(ReaderType.FILE_READER);
	}
	
	@Bean
	public Reader dbReader() {
		return readerFactory().getReader(ReaderType.DB_READER);
	}
}
