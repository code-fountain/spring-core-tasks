package com.codefountain.spring.core.javaconfig.base;

public class Address {

    private String unit;
    private String street;

    public Address(String unit, String street) {
        this.unit = unit;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "unit='" + unit + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
