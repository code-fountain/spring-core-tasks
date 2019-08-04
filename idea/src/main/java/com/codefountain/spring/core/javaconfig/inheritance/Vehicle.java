package com.codefountain.spring.core.javaconfig.inheritance;

public abstract class Vehicle {

    private String regNo;
    private String brand;

    public Vehicle(String regNo, String brand) {
        this.regNo = regNo;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "regNo='" + regNo + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
