package com.codefountain.spring.core.javaconfig.inheritance;

public class Car extends Vehicle{

    private boolean airConditioned;

    public Car(String regNo, String brand) {
        super(regNo, brand);
    }

    public void setAirConditioned(boolean airConditioned) {
        this.airConditioned = airConditioned;
    }

    public boolean isAirConditioned() {
        return airConditioned;
    }
}
