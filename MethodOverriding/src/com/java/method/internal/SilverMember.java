package com.java.method.internal;

public class SilverMember extends Membership {
    public SilverMember() {
        System.out.println("Silver Member activated");
    }

    @Override
    public void showBenefits() {
        System.out.println("Silver Member: Extra discounts and early access to deals");
    }

    public void accessLounge() {
        System.out.println("Lounge access granted to Silver Member");
    }
}
