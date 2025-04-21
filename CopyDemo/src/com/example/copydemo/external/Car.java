package com.example.copydemo.external;

import com.example.copydemo.internal.Vehicle;

public class Car extends Vehicle {
    private int year;

    public Car(String brand, int year) {
        super(brand);
        this.year = year;
    }

    // Copy constructor
    public Car(Car other) {
        super(other.brand);
        this.year = other.year;
    }

    public void displayInfo() {
        displayBrand();
        System.out.println("Year: " + year);
    }
}
