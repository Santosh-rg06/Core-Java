package com.java.method.internal;

public class ShampooRunner {
    public static void main(String[] args) {
        Shampoo s = new Shampoo();
        s.cleanHair();

        Shampoo hs = new HerbalShampoo();
        hs.cleanHair();

        HerbalShampoo herbal = new HerbalShampoo();
        herbal.cleanHair();
        herbal.addFragrance();
    }
}
