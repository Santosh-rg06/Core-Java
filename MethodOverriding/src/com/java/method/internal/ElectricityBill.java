package com.java.method.internal;

public class ElectricityBill extends Bill {
    public ElectricityBill() {
        System.out.println("Electricity bill is calculated");
    }

    @Override
    public void printBill() {
        System.out.println("Printing electricity bill with usage details");
    }

    public void showUnitsUsed() {
        System.out.println("Displaying units consumed this month");
    }
}
