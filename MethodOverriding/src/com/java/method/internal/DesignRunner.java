package com.java.method.internal;

public class DesignRunner {
    public static void main(String[] args) {
        Architect a = new Architect();
        a.design();

        Architect id = new InteriorDesigner();
        id.design();

        InteriorDesigner interior = new InteriorDesigner();
        interior.design();
        interior.decorate();
    }
}
