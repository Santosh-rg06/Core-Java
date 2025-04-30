package com.xworkz;

public class Word{
    public static void main(String[] args) {
        String input = "rcb will win the match aginest";
        for (String word : input.split(" "))
            System.out.print(word.length() + " ");
    }
}

