package com.java.inheritance.runner;

import com.java.inheritance.external.Biscuit;
import com.java.inheritance.external.GoodDayBiscuit;
import com.java.inheritance.internal.Food;
import com.java.inheritance.internal.Snack;

public class Runner {
    public static void main(String[] args) {
        Food food = new Food();
        Food food1 = new Snack();
        Food food2 = new Biscuit();
        Food food3 = new GoodDayBiscuit();
    }
}