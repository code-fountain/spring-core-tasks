package com.codefountain.spring.core.factory;

public class FileReader implements Reader {

	@Override
	public void read() {
		System.out.println("File reader");
	}

}
