package com.java.method.internal;

public class ArtistRunner {
    public static void main(String[] args) {
        Artist a = new Artist();
        a.create();

        Artist p = new Painter();
        p.create();

        Painter painter = new Painter();
        painter.create();
        painter.style();
    }
}
