package com.java.method.internal;

public class FridgeRunner {
    public static void main(String[] args) {
        Fridge f = new Fridge();
        f.coolItems();

        Fridge sf = new SmartFridge();
        sf.coolItems();

        SmartFridge smart = new SmartFridge();
        smart.coolItems();
        smart.connectWifi();
    }
}
