package com.xworks.encapsulation.external;

import com.xworks.encapsulation.internal.Keychain;

public class KeychainViewer {
    public void display() {
        Keychain keychain = new Keychain();
        System.out.println("Viewing Keychain Info:");
        System.out.println("Owner: " + keychain.getOwner());
        System.out.println("Total Keys: " + keychain.getTotalKeys());
        System.out.println("Key Type: " + keychain.getKeyType());
        System.out.println("Locked? " + keychain.isLocked());
        System.out.println("Weight: " + keychain.getWeight());
    }
}
