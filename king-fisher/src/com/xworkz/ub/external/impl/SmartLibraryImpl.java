package com.xworkz.ub.external.impl;

import com.xworkz.ub.internal.rule.SmartLibrary;

public class SmartLibraryImpl implements SmartLibrary {
    public void scanBook() {
        System.out.println("SmartLibrary: Book scanned.");
    }
    public void checkAvailability() {
        System.out.println("SmartLibrary: Checking availability.");
    }
    public void issueBook() {
        System.out.println("SmartLibrary: Book issued.");
    }
}
