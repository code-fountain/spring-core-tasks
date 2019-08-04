package com.codefountain.spring.core.bean.collaboration;

public class Address {
	
	private String unitName;
	private String street;
	private String area;
	private String pin;
	
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "Address [unitName=" + unitName + ", street=" + street + ", area=" + area + ", pin=" + pin + "]";
	}
}
