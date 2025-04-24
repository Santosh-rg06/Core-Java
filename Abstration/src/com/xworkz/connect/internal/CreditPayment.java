package com.xworkz.connect.internal;

public class CreditPayment implements Payment {
    @Override
    public void save() {
        System.out.println("Processing credit card payment");
    }
}
