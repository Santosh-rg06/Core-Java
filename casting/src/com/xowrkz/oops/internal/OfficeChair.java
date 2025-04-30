package com.xowrkz.oops.internal;

public class OfficeChair extends Chair {

    public OfficeChair() {
        System.out.println("No-arg constructor of OfficeChair");
    }

    @Override
    public void sit() {
        System.out.println("OfficeChair offers back support and adjustable height.");
    }

    public void rotate() {
        System.out.println("OfficeChair can rotate 360 degrees.");
    }
}
