package com.xworkz.connect.internal;

public class SmsNotifier implements Notifier {
    @Override
    public void save() {
        System.out.println("Sending notification in sms");
    }
}
