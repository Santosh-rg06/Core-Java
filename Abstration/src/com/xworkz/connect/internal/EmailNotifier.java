package com.xworkz.connect.internal;

public class EmailNotifier implements Notifier{
    @Override
    public void save() {
        System.out.println("Sending notification in email");
    }
}
