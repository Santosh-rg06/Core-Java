package com.java.method.internal;

public class OceanRunner {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.move();

        Fish s = new Shark();
        s.move();

        Shark shark = new Shark();
        shark.move();
        shark.attack();
    }
}
