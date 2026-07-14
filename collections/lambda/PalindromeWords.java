package com.wipro.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromeWords {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("java");
        words.add("level");
        words.add("hello");
        words.add("radar");
        words.add("apple");
        words.add("noon");
        words.add("book");
        words.add("racecar");
        words.add("wipro");

        Predicate<String> isPalindrome = str -> {
            String rev = new StringBuilder(str).reverse().toString();
            return str.equals(rev);
        };

        System.out.println("Palindrome Words:");

        for (String word : words) {
            if (isPalindrome.test(word)) {
                System.out.println(word);
            }
        }
    }
}