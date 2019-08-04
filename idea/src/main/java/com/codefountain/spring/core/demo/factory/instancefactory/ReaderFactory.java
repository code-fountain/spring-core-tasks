package com.codefountain.spring.core.demo.factory.instancefactory;

//-Dspring.profiles.active=Test
import java.util.Map;

public class ReaderFactory {


    private Map<ReaderType, Reader> readers = null;

    public void setReaders(Map<ReaderType, Reader> readers) {
        this.readers = readers;
    }

    public Reader createReader(ReaderType readerType){

        if(readers.containsKey(readerType)){
            return readers.get(readerType);
        }

        throw  new IllegalArgumentException("Invalid reader type");
    }
}
