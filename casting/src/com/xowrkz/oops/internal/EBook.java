package com.xowrkz.oops.internal;

public class EBook extends Book {

    public EBook() {
        System.out.println("No-arg constructor of EBook");
    }

    @Override
    public void read() {
        System.out.println("Reading an EBook on a digital device.");
    }

    public void download() {
        System.out.println("Downloading EBook from the cloud.");
    }
}
