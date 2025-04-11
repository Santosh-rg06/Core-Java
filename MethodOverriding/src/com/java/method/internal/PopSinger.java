package com.java.method.internal;

public class PopSinger extends Singer {
    public PopSinger() {
        System.out.println("PopSinger wears flashy outfit");
    }

    @Override
    public void sing() {
        System.out.println("Performing a pop song");
    }

    public void dance() {
        System.out.println("Dancing on stage");
    }
}
