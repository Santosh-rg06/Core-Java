package com.java.method.internal;

public class OfflineOrderRunner {
    public static void main(String[] args) {
        Order o = new Order();
        o.processOrder();

        Order off = new OfflineOrder();
        off.processOrder();

        OfflineOrder offline = new OfflineOrder();
        offline.processOrder();
        offline.printReceipt();
    }
}
