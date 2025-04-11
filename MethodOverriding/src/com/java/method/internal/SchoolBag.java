package com.java.method.internal;

public class SchoolBag extends Bag {
    public SchoolBag() {
        System.out.println("A school bag is created");
    }

    @Override
    public void carryItems() {
        System.out.println("School bag is used to carry books and stationery");
    }

    public void packLunchBox() {
        System.out.println("Lunch box packed inside school bag");
    }
}
