package com.java.method.internal;

public class LaserPrinter extends Printer {
    public LaserPrinter() {
        System.out.println("LaserPrinter is ready");
    }

    @Override
    public void print() {
        System.out.println("Printing with laser precision");
    }

    public void duplex() {
        System.out.println("Duplex printing enabled");
    }
}
