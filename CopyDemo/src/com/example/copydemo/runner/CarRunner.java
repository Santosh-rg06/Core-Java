package com.example.copydemo.runner;

import com.example.copydemo.external.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        System.out.println("Original:");
        car1.displayInfo();

        Car car2 = new Car(car1);
        System.out.println("Copy:");
        car2.displayInfo();
    }
}
