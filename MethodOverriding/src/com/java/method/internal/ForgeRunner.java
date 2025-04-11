package com.java.method.internal;

public class ForgeRunner {
    public static void main(String[] args) {
        Metal m = new Metal();
        m.shape();

        Metal s = new Sword();
        s.shape();

        Sword sword = new Sword();
        sword.shape();
        sword.polish();
    }
}
