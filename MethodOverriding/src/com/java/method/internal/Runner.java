package com.java.method.internal;

public class Runner {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.move();
        Vehicle c = new Car();
        c.move();
        Car car = new Car();
        car.move();
        car.speed();
    }
}
