package com.codefountain.spring.core.demo.factory.instancefactory;

public class DBReader implements Reader {

    @Override
    public void read() {
        System.out.println("DB Reader is reading data from db");
    }
}
