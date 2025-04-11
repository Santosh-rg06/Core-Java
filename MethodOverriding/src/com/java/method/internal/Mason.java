package com.java.method.internal;

public class Mason extends Builder {
    public Mason() {
        System.out.println("Mason lays bricks");
    }

    @Override
    public void build() {
        System.out.println("Building a strong wall");
    }

    public void cement() {
        System.out.println("Mixing cement");
    }
}
