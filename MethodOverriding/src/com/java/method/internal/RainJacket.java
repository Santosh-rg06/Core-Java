package com.java.method.internal;

public class RainJacket extends Jacket {
    public RainJacket() {
        System.out.println("Rain jacket is prepared");
    }

    @Override
    public void wear() {
        System.out.println("Wearing a waterproof rain jacket");
    }

    public void fold() {
        System.out.println("Rain jacket can be folded into a small pouch");
    }
}
