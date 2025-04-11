package com.java.method.internal;

public class BagRunner {
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.carryItems();

        Bag school = new SchoolBag();
        school.carryItems();

        SchoolBag sb = new SchoolBag();
        sb.carryItems();
        sb.packLunchBox();
    }
}
