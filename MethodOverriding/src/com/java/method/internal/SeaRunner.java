package com.java.method.internal;

public class SeaRunner {
    public static void main(String[] args) {
        Captain c = new Captain();
        c.sail();

        Captain sc = new ShipCaptain();
        sc.sail();

        ShipCaptain ship = new ShipCaptain();
        ship.sail();
        ship.anchor();
    }
}
