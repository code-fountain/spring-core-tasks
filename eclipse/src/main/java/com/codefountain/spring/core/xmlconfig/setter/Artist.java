package com.codefountain.spring.core.xmlconfig.setter;

public class Artist {

	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Artist [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
