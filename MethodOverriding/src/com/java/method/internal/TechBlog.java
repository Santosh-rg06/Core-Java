package com.java.method.internal;

public class TechBlog extends Blog {
    public TechBlog() {
        System.out.println("Tech blog initiated");
    }

    @Override
    public void publish() {
        System.out.println("Publishing a tech blog with latest updates");
    }

    public void reviewProduct() {
        System.out.println("Reviewing a new gadget on the tech blog");
    }
}
