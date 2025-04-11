package com.java.method.internal;

public class GarageRunner {
    public static void main(String[] args) {
        Mechanic m = new Mechanic();
        m.repair();

        Mechanic bm = new BikeMechanic();
        bm.repair();

        BikeMechanic b = new BikeMechanic();
        b.repair();
        b.testRide();
    }
}
