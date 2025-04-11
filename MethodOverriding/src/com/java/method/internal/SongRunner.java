package com.java.method.internal;

public class SongRunner {
    public static void main(String[] args) {
        Musician m = new Musician();
        m.play();

        Musician g = new Guitarist();
        g.play();

        Guitarist gt = new Guitarist();
        gt.play();
        gt.solo();
    }
}
