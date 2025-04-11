package com.java.method.internal;

public class MangoTree extends Tree {
    public MangoTree() {
        System.out.println("mango tree is sprouting leaves");
    }

    @Override
    public void grow() {
        System.out.println("mango tree is growing sweet fruits");
    }

    public void harvest() {
        System.out.println("harvesting ripe mangoes");
    }
}
