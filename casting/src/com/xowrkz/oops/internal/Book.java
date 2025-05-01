package com.xowrkz.oops.internal;

public class Book {
    private String title;
    private String author;

    public Book() {
        System.out.println("No-arg constructor of Book");
    }

    public void read() {
        System.out.println("Reading a physical book.");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(Book ref) {
        this.title = ref.title;
        this.author = ref.author;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}
