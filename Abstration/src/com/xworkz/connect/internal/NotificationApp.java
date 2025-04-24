package com.xworkz.connect.internal;

public class NotificationApp {
    private Notifier notifier;

    public NotificationApp(Notifier notifier) {
        this.notifier = notifier;
    }

    public void details() {
        if (notifier != null) {
            System.out.println("Starting alert process");
            notifier.save();
        } else {
            System.out.println("Notifier is not available");
        }
    }
}
