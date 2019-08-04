package com.codefountain.spring.core.factory.staticfactory;

public class FileReader implements Reader {

    @Override
    public void read() {
        System.out.println("File reader reads.");
    }
}
