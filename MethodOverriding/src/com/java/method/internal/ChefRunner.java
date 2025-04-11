package com.java.method.internal;

public class ChefRunner {
    public static void main(String[] args) {
        Chef c = new Chef();
        c.cook();

        Chef b = new Baker();
        b.cook();

        Baker baker = new Baker();
        baker.cook();
        baker.bakeCake();
    }
}
