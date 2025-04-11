package com.java.method.internal;

public class DeviceRunner {
    public static void main(String[] args) {
        Device d = new Device();
        d.start();

        Device m = new Mobile();
        m.start();

        Mobile mobile = new Mobile();
        mobile.start();
        mobile.call();
    }
}
