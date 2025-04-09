package com.xworks.encapsulation.internal;

public class KeychainUser {
    public void test() {
        Keychain keychain = new Keychain();
        keychain.setOwner("Ravi");
        keychain.setTotalKeys(4);
        keychain.setKeyType("Metal");
        keychain.setLocked(false);
        keychain.setWeight(0.35);

        System.out.println("Owner: " + keychain.getOwner());
        System.out.println("Locked? " + keychain.isLocked());

        keychain.unlock();
    }
}
