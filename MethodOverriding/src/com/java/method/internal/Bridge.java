package com.java.method.internal;

public class Bridge extends Structure {
    public Bridge() {
        System.out.println("bridge construction has started");
    }

    @Override
    public void design() {
        System.out.println("bridge is designed for heavy load");
    }

    public void testLoad() {
        System.out.println("bridge is being tested for load capacity");
    }
}
