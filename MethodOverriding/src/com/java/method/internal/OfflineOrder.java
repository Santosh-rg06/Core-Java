package com.java.method.internal;

public class OfflineOrder extends Order {
    public OfflineOrder() {
        System.out.println("Offline order placed at store");
    }

    @Override
    public void processOrder() {
        System.out.println("Processing offline order: Cash payment and pickup");
    }

    public void printReceipt() {
        System.out.println("Printed physical receipt for offline order");
    }
}
