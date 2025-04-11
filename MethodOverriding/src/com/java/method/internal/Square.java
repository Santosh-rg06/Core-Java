package com.java.method.internal;

public class Square extends Shape {
    public Square() {
        System.out.println("Square constructor called");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with equal sides");
    }

    public void calculateArea() {
        System.out.println("Calculating area of the square");
    }
}
