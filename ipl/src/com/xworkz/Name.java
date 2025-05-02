package com.xworkz;

public class Name{
    public static void main(String[] args) {
        String input = "rcb will win the match";
        for (String word : input.split(" "))
            System.out.print(word.length() + " ");
    }
}

