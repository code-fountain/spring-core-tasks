package com.codefountain.spring.core.factory.staticfactory;

public class SocketReader implements Reader{

    @Override
    public void read() {
        System.out.println("Socket reader reads.");
    }
}
