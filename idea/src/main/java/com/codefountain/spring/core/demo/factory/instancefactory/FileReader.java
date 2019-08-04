package com.codefountain.spring.core.demo.factory.instancefactory;

public class FileReader implements Reader {

    @Override
    public void read() {
        System.out.println("File Reader read the data");
    }
}
