package com.example.copydemo.external;

import com.example.copydemo.internal.Shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Copy constructor
    public Rectangle(Rectangle other) {
        super(other.color);
        this.width = other.width;
        this.height = other.height;
    }

    @Override
    public double area() {
        return width * height;
    }

    public void displayInfo() {
        displayColor();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area());
    }
}
