
package com.xworkz;

public class Count {

    public static void main(String[] args) {
        String sentence = "Today is my day, I will do best";
        int vowels = 0, consonants = 0;

        for (char c : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) == -1) vowels++;
                else consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
