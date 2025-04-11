package com.java.method.internal;

public class NotifyRunner {
    public static void main(String[] args) {
        Notification n = new Notification();
        n.send();

        Notification in = new InAppNotification();
        in.send();

        InAppNotification inApp = new InAppNotification();
        inApp.send();
        inApp.showPopup();
    }
}
