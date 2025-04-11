package com.java.method.internal;

public class ToolRunner {
    public static void main(String[] args) {
        Tool t = new Tool();
        t.use();

        Tool h = new Hammer();
        h.use();

        Hammer hammer = new Hammer();
        hammer.use();
        hammer.repair();
    }
}
