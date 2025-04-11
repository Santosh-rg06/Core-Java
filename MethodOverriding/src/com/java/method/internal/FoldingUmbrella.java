package com.java.method.internal;

public class FoldingUmbrella extends Umbrella {
    public FoldingUmbrella() {
        System.out.println("Folding umbrella is ready to use");
    }

    @Override
    public void protect() {
        System.out.println("Compact protection from sun and rain");
    }

    public void fold() {
        System.out.println("Folding umbrella for storage");
    }
}
