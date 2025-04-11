package com.java.method.internal;

public class Guest extends User {
    public Guest() {
        System.out.println("Guest session started");
    }

    @Override
    public void login() {
        System.out.println("Guest login with limited access");
    }

    public void browseContent() {
        System.out.println("Guest is browsing public content");
    }
}
