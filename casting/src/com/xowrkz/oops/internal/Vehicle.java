package com.xowrkz.oops.internal;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle() {
        System.out.println("No-arg constructor of Vehicle");
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Vehicle(Vehicle ref) {
        this.brand = ref.brand;
        this.year = ref.year;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Year: " + year;
    }
}
