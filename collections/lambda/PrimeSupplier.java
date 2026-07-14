package com.wipro.lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

public class PrimeSupplier {

    public static void main(String[] args) {

        Supplier<ArrayList<Integer>> prime = () -> {

            ArrayList<Integer> list = new ArrayList<>();

            int num = 2;

            while (list.size() < 10) {

                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    list.add(num);
                }

                num++;
            }

            return list;
        };

        System.out.println("First 10 Prime Numbers:");
        System.out.println(prime.get());
    }
}