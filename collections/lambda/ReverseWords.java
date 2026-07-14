package com.wipro.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ReverseWords {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Python");
        words.add("Wipro");
        words.add("Apple");
        words.add("Orange");
        words.add("Laptop");
        words.add("Mobile");
        words.add("Mouse");
        words.add("Keyboard");
        words.add("Monitor");

        Consumer<ArrayList<String>> reverse = list -> {

            for (int i = 0; i < list.size(); i++) {

                String rev = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, rev);
            }
        };

        reverse.accept(words);

        System.out.println("Reversed Words:");
        System.out.println(words);
    }
}