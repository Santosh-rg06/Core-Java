package com.java.method.internal;

public class Novel extends Book {
    public Novel() {
        System.out.println("flipping through a mystery novel");
    }

    @Override
    public void read() {
        System.out.println("reading thrilling story chapters");
    }

    public void author() {
        System.out.println("novel written by a famous writer");
    }
}
