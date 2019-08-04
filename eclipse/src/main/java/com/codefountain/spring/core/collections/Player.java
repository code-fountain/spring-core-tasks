package com.codefountain.spring.core.collections;

public class Player {

	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ Player: "+name+" ]";
	}
}
