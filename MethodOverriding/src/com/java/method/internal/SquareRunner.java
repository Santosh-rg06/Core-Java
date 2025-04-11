package com.java.method.internal;

public class SquareRunner {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();

        Shape sq = new Square();
        sq.draw();

        Square square = new Square();
        square.draw();
        square.calculateArea();
    }
}
