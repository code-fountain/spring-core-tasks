package com.codefountain.spring.core.factory;

import java.util.HashMap;
import java.util.Map;

public class ReaderFactory {

	private Map<ReaderType, Reader> readers = new HashMap<>();

	public void setReaders(Map<ReaderType, Reader> readers) {
		this.readers = readers;
	}
	
	public Reader getReader(ReaderType readerType) {
		if(readers.containsKey(readerType)) {
			return readers.get(readerType);
		}
		throw new IllegalArgumentException("Report type not valid");
	}
}
