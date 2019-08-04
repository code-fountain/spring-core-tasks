package com.codefountain.spring.core.javaconfig;

public class Artist {
	
	private String firstName;
	private String lastName;
	
	public Artist(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Artist [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
