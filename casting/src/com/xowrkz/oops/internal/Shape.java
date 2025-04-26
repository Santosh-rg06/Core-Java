package com.xowrkz.oops.internal;

public class Shape {
    private String color;

    public Shape() {
        System.out.println("No-arg constructor of Shape");
    }

    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(Shape ref) {
        this.color = ref.color;
    }

    @Override
    public String toString() {
        return "Shape{color='" + color + "'}";
    }
}
