package com.wipro.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class OddEven {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        Consumer<Integer> check = n -> {

            if (n % 2 == 0)
                System.out.println(n + " Even");
            else
                System.out.println(n + " Odd");
        };

        numbers.forEach(check);
    }
}