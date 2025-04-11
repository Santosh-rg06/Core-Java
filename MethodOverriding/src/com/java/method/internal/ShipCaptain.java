package com.java.method.internal;

public class ShipCaptain extends Captain {
    public ShipCaptain() {
        System.out.println("ShipCaptain checks the compass");
    }

    @Override
    public void sail() {
        System.out.println("Sailing across the Atlantic Ocean");
    }

    public void anchor() {
        System.out.println("Dropping the anchor");
    }
}
