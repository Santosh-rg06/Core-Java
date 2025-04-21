package com.example.external;

import com.example.internal.Polygon;

public class Triangle extends Polygon {
    @Override
    public void define() {
        System.out.println("A triangle has 3 sides.");
    }

    @Override
    public void calculateArea() {
        System.out.println("Area = 0.5 * base * height");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter = sum of all three sides");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }

    @Override
    public void properties() {
        System.out.println("Can be equilateral, isosceles, or scalene.");
    }
}
