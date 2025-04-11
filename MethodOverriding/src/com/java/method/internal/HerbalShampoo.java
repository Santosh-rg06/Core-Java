package com.java.method.internal;

public class HerbalShampoo extends Shampoo {
    public HerbalShampoo() {
        System.out.println("Herbal shampoo created");
    }

    @Override
    public void cleanHair() {
        System.out.println("Herbal shampoo cleans and nourishes hair naturally");
    }

    public void addFragrance() {
        System.out.println("Adds herbal fragrance to hair");
    }
}
