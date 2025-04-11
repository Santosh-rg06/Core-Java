package com.java.method.internal;

public class BillRunner {
    public static void main(String[] args) {
        Bill b = new Bill();
        b.printBill();

        Bill eb = new ElectricityBill();
        eb.printBill();

        ElectricityBill eBill = new ElectricityBill();
        eBill.printBill();
        eBill.showUnitsUsed();
    }
}
