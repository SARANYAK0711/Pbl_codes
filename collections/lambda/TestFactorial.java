package com.wipro.lambda;

public class TestFactorial {

    public static void main(String[] args) {

        Factorial obj = new Factorial();

        // Method Reference
        FactorialInterface f = obj::factorial;

        int result = f.factorial(5);

        System.out.println("Factorial = " + result);
    }
}