package com.java.method.internal;

public class InteriorDesigner extends Architect {
    public InteriorDesigner() {
        System.out.println("InteriorDesigner selects furniture");
    }

    @Override
    public void design() {
        System.out.println("Designing home interiors");
    }

    public void decorate() {
        System.out.println("Decorating with art and lights");
    }
}
