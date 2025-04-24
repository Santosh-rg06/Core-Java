package com.xworkz.connect.internal;

public class UpiPayment implements Payment {
    @Override
    public void save() {
        System.out.println("Processing upi payment");
    }
}
