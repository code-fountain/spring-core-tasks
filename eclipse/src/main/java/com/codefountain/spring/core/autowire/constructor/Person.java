package com.codefountain.spring.core.autowire.constructor;

public class Person {
	
	private String id;
	private String name;
	private Address address;
	
	public Person(String id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
