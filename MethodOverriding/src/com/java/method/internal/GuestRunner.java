package com.java.method.internal;

public class GuestRunner {
    public static void main(String[] args) {
        User u = new User();
        u.login();

        User g = new Guest();
        g.login();

        Guest guest = new Guest();
        guest.login();
        guest.browseContent();
    }
}
