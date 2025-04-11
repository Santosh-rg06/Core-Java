package com.java.method.internal;

public class VendorRunner {
    public static void main(String[] args) {
        Supplier s = new Supplier();
        s.supplyGoods();

        Supplier v = new Vendor();
        v.supplyGoods();

        Vendor vendor = new Vendor();
        vendor.supplyGoods();
        vendor.manageInventory();
    }
}
