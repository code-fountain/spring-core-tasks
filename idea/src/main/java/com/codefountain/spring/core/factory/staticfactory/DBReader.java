package com.codefountain.spring.core.factory.staticfactory;

public class DBReader implements Reader{

    @Override
    public void read() {
        System.out.println("DBReader reads");
    }
}
