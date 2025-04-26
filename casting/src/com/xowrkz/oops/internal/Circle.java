package com.xowrkz.oops.internal;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        System.out.println("No-arg constructor of Circle");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle is: " + area);
    }
}
