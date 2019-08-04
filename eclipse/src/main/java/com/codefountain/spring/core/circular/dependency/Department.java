package com.codefountain.spring.core.circular.dependency;

public class Department {
	
	private Employee emp;
	
	public Department(Employee emp) {
		this.emp = emp;
	}

}
