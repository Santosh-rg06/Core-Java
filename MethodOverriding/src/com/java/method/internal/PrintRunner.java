package com.java.method.internal;

public class PrintRunner {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();

        Printer lp = new LaserPrinter();
        lp.print();

        LaserPrinter lprint = new LaserPrinter();
        lprint.print();
        lprint.duplex();
    }
}
