package com.java.method.internal;

public class PremiumAccountHolder extends SingleAccountHolder {
    public PremiumAccountHolder() {
        System.out.println("PremiumAccountHolder profile created with benefits");
    }

    @Override
    public void accountType() {
        System.out.println("Premium account with added features activated");
    }

    public void accessLounge() {
        System.out.println("Access granted to premium lounge services");
    }
}
