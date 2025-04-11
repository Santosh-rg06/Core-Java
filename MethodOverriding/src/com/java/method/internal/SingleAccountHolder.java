package com.java.method.internal;

public class SingleAccountHolder {
    protected SingleAccountHolder() {
        System.out.println("SingleAccountHolder profile created");
    }

    public void accountType() {
        System.out.println("Basic savings account opened");
    }
}
