package com.java.method.internal;

public class InstrumentRunner {
    public static void main(String[] args) {
        Instrument i = new Instrument();
        i.play();

        Instrument g = new Guitar();
        g.play();

        Guitar guitar = new Guitar();
        guitar.play();
        guitar.genre();
    }
}
