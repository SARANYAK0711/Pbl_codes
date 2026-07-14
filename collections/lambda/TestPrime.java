package com.wipro.lambda;

public class TestPrime {

    public static void main(String[] args) {

        // Constructor Reference
        PrimeInterface p = PrimeCheck::new;

        p.check(17);   // Prime
        p.check(20);   // Not Prime
    }
}