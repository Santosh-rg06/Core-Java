package com.java.method.internal;

public class BlogRunner {
    public static void main(String[] args) {
        Blog blog = new Blog();
        blog.publish();

        Blog tech = new TechBlog();
        tech.publish();

        TechBlog t = new TechBlog();
        t.publish();
        t.reviewProduct();
    }
}
