package com.java.method.internal;

public class Hammer extends Tool {
    public Hammer() {
        System.out.println("hammer is ready for construction task");
    }

    @Override
    public void use() {
        System.out.println("hammer is striking the nail");
    }

    public void repair() {
        System.out.println("hammer is fixing the broken frame");
    }
}
