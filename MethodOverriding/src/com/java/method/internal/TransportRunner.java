package com.java.method.internal;

public class TransportRunner {
    public static void main(String[] args) {
        Transport t = new Transport();
        t.move();

        Transport b = new Bike();
        b.move();

        Bike bike = new Bike();
        bike.move();
        bike.applyBrake();
    }
}
