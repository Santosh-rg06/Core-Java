package com.java.method.internal;

public class ConcertRunner {
    public static void main(String[] args) {
        Singer s = new Singer();
        s.sing();

        Singer ps = new PopSinger();
        ps.sing();

        PopSinger pop = new PopSinger();
        pop.sing();
        pop.dance();
    }
}
