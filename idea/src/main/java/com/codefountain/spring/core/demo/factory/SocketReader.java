package com.codefountain.spring.core.demo.factory;

public class SocketReader implements Reader {

    @Override
    public void read() {
        System.out.println("Socket Reader reading data from socket");
    }
}
