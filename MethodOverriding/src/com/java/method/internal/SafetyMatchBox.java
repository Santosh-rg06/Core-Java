package com.java.method.internal;

public class SafetyMatchBox extends MatchBox {
    public SafetyMatchBox() {
        System.out.println("Safety MatchBox is ready");
    }

    @Override
    public void ignite() {
        System.out.println("Safety match ignites only on box surface");
    }

    public void seal() {
        System.out.println("Safety matchbox has childproof seal");
    }
}
