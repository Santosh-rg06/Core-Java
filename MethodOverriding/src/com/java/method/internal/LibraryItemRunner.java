package com.java.method.internal;

public class LibraryItemRunner {
    public static void main(String[] args) {
        LibraryItem li = new LibraryItem();
        li.info();

        LibraryItem book = new BookItem();
        book.info();

        BookItem bi = new BookItem();
        bi.info();
        bi.borrow();
    }
}
