package com.wipro.lambda;

import java.util.ArrayList;

public class NegativeEvenFilter {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(-2);
        list.add(5);
        list.add(-8);
        list.add(10);
        list.add(-12);
        list.add(15);
        list.add(-20);
        list.add(7);
        list.add(-4);

        ArrayList<Integer> result = new ArrayList<Integer>();

        // Lambda Expression
        list.forEach(n -> {
            if (n < 0 && n % 2 == 0) {
                result.add(n);
            }
        });

        System.out.println("Negative Even Numbers:");
        result.forEach(n -> System.out.println(n));
    }
}