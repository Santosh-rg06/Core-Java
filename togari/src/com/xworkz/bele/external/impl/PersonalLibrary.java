package com.xworkz.bele.external.impl;

import com.xworkz.bele.internal.rule.Library;

public class PersonalLibrary implements Library {

    @Override
    public void borrowBook() {
        System.out.println("Borrowing a book from the personal library");
    }

    @Override
    public void returnBook() {
        System.out.println("Returning a book to the personal library");
    }

    @Override
    public void readQuietly() {
        System.out.println("Reading quietly in the personal library");
    }
}
