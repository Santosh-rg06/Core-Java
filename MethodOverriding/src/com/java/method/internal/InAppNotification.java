package com.java.method.internal;

public class InAppNotification extends Notification {
    public InAppNotification() {
        System.out.println("InAppNotification initialized for user");
    }

    @Override
    public void send() {
        System.out.println("Sending in-app notification to user's dashboard");
    }

    public void showPopup() {
        System.out.println("Displaying notification as popup");
    }
}
