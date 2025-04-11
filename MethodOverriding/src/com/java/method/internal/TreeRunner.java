package com.java.method.internal;

public class TreeRunner {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.grow();

        Tree m = new MangoTree();
        m.grow();

        MangoTree mangoTree = new MangoTree();
        mangoTree.grow();
        mangoTree.harvest();
    }
}
