package com.java.method.internal;

public class SoapRunner {
    public static void main(String[] args) {
        Soap s = new Soap();
        s.clean();

        Soap hs = new HandmadeSoap();
        hs.clean();

        HandmadeSoap handmade = new HandmadeSoap();
        handmade.clean();
        handmade.fragrance();
    }
}
