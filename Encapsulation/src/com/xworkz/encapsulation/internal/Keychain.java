package com.xworks.encapsulation.internal;

public class Keychain {
    private String owner;
    private int totalKeys;
    private String keyType;
    private boolean locked;
    private double weight;

    public void setOwner(String owner) { this.owner = owner; }
    public void setTotalKeys(int totalKeys) { this.totalKeys = totalKeys; }
    public void setKeyType(String keyType) { this.keyType = keyType; }
    public void setLocked(boolean locked) { this.locked = locked; }
    public void setWeight(double weight) { this.weight = weight; }

    public String getOwner() { return owner; }
    public int getTotalKeys() { return totalKeys; }
    public String getKeyType() { return keyType; }
    public boolean isLocked() { return locked; }
    public double getWeight() { return weight; }

    public void unlock() {
        System.out.println(owner + "'s keychain unlocked. Key type: " + keyType);
    }
}
