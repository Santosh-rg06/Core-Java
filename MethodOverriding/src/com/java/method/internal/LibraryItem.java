package com.java.method.internal;

public class LibraryItem {
    protected LibraryItem() {
        System.out.println("Library item registered");
    }

    public void info() {
        System.out.println("This is a general library item");
    }
}
