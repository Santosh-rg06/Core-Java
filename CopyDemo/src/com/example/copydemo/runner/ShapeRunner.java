package com.example.copydemo.runner;

import com.example.copydemo.external.Rectangle;

public class ShapeRunner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle("Blue", 5.0, 3.0);
        System.out.println("Original Rectangle:");
        rect1.displayInfo();

        Rectangle rect2 = new Rectangle(rect1);
        System.out.println("\nCopied Rectangle:");
        rect2.displayInfo();
    }
}
