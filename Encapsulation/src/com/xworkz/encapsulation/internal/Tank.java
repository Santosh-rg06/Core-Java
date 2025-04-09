package com.xworks.encapsulation.internal;

public class Tank {
    private String model;
    private String country;
    private int crewCount;
    private boolean active;
    private double firepower;

    public void setModel(String model) { this.model = model; }
    public void setCountry(String country) { this.country = country; }
    public void setCrewCount(int crewCount) { this.crewCount = crewCount; }
    public void setActive(boolean active) { this.active = active; }
    public void setFirepower(double firepower) { this.firepower = firepower; }

    public String getModel() { return model; }
    public String getCountry() { return country; }
    public int getCrewCount() { return crewCount; }
    public boolean isActive() { return active; }
    public double getFirepower() { return firepower; }

    public void fire() {
        System.out.println(model + " from " + country + " fired with power: " + firepower);
    }
}
