package com.java.method.internal;

public class Vendor extends Supplier {
    public Vendor() {
        System.out.println("Vendor added to marketplace");
    }

    @Override
    public void supplyGoods() {
        System.out.println("Vendor delivers retail goods to customers");
    }

    public void manageInventory() {
        System.out.println("Vendor manages product inventory online");
    }
}
