package com.wipro.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PerfectSquare {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(7);
        list.add(9);
        list.add(10);
        list.add(16);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(36);
        list.add(40);

        Predicate<Integer> isPerfectSquare = n -> {
            int root = (int) Math.sqrt(n);
            return root * root == n;
        };

        System.out.println("Perfect Square Numbers:");

        for (int n : list) {
            if (isPerfectSquare.test(n)) {
                System.out.println(n);
            }
        }
    }
}