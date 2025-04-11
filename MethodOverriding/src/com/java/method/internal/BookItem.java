package com.java.method.internal;

public class BookItem extends LibraryItem {
    public BookItem() {
        System.out.println("Book item added to catalog");
    }

    @Override
    public void info() {
        System.out.println("Book Item: Title, Author, ISBN, Shelf No.");
    }

    public void borrow() {
        System.out.println("Book borrowed by user");
    }
}
