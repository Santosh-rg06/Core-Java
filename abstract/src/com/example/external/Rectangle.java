package com.example.external;

import com.example.internal.Polygon;

public class Rectangle extends Polygon {
    @Override
    public void define() {
        System.out.println("A rectangle has 4 sides and 4 right angles.");
    }

    @Override
    public void calculateArea() {
        System.out.println("Area = length * width");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter = 2 * (length + width)");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    @Override
    public void properties() {
        System.out.println("Opposite sides are equal and parallel.");
    }
}
