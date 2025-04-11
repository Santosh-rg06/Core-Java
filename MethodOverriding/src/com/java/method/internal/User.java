package com.java.method.internal;

public class User {
    protected User() {
        System.out.println("User account created");
    }

    public void login() {
        System.out.println("User login with credentials");
    }
}
