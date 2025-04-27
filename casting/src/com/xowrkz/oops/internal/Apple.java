package com.xowrkz.oops.internal;

public class Apple extends Fruit {

    public Apple() {
        System.out.println("No-arg constructor of Apple");
    }

    @Override
    public void taste() {
        System.out.println("Apple tastes sweet and juicy!");
    }

    public void makeJuice() {
        System.out.println("Making fresh apple juice!");
    }
}
