package com.java.method.internal;

public class BookRunner {
    public static void main(String[] args) {
        Book b = new Book();
        b.read();

        Book n = new Novel();
        n.read();

        Novel novel = new Novel();
        novel.read();
        novel.author();
    }
}
