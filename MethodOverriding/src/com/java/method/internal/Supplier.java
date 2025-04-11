package com.java.method.internal;

public class Supplier {
    protected Supplier() {
        System.out.println("Supplier registered in the system");
    }

    public void supplyGoods() {
        System.out.println("Supplier delivers bulk goods");
    }
}
