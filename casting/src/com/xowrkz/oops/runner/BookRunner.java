package com.xowrkz.oops.runner;

import com.xowrkz.oops.internal.Book;
import com.xowrkz.oops.internal.EBook;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book();
        book.read();

        Book digitalBookAsBook = new EBook();
        digitalBookAsBook.read();

        System.out.println("**********");

        EBook ebook = new EBook();
        ebook.read();
        ebook.download();

        Book b1 = new Book();
        b1.setTitle("Java OOP Guide");
        b1.setAuthor("Sun Microsystems");

        Book b2 = new Book(b1); // Copy constructor
        System.out.println(b2);
    }
}
