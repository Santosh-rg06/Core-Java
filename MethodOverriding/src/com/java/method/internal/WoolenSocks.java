package com.java.method.internal;

public class WoolenSocks extends Socks {
    public WoolenSocks() {
        System.out.println("Woolen socks are created");
    }

    @Override
    public void wear() {
        System.out.println("Wearing warm woolen socks");
    }

    public void wash() {
        System.out.println("Woolen socks need gentle washing");
    }
}
