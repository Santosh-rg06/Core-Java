package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Shape;
import com.xowrkz.oops.internal.Circle;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Shape circleShape = new Circle(); // Upcasting
        circleShape.draw();

        System.out.println("**********");

        Circle myCircle = new Circle();
        myCircle.draw();
        myCircle.setRadius(7.5);
        myCircle.calculateArea();

        Shape original = new Shape();
        original.setColor("Red");

        Shape copy = new Shape(original);
        System.out.println(copy);
    }
}
