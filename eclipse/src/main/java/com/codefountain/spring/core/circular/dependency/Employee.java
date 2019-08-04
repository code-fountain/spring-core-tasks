package com.codefountain.spring.core.circular.dependency;

public class Employee {

	private Department dept;
	
	public Employee(Department dept) {
		this.dept = dept;
	}
}
