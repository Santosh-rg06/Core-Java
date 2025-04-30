package com.xworkz;

public class Main {
    public static void main(String[] args) {
        String s = "RCB will win the match";
        String res = "";
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            res += " ";
            if (i == 2 || i == 3) {
                res += new StringBuilder(words[i]).reverse().toString();
                continue;
            }
            res += words[i];
        }

        System.out.println(res.trim());
    }
}

