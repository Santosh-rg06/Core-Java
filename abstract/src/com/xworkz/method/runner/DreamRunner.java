package com.xworkz.method.runner;


import com.xworkz.method.internal.Dream;

public class DreamRunner {
    public static void main(String[] args) {
        Dream career = new CareerDream();
        Dream art = new ArtisticDream();

        System.out.println("== Career Dream ==");
        career.imagine();
        career.pursue();
        career.struggle();
        career.achieve();
        career.reflect();

        System.out.println("\n== Artistic Dream ==");
        art.imagine();
        art.pursue();
        art.struggle();
        art.achieve();
        art.reflect();
    }
}

