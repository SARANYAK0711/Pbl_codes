package com.wipro.lambda;

public class TestDigitCount {

    public static void main(String[] args) {

        // Static Method Reference
        DigitCountInterface d = DigitCount::digitCount;

        int result = d.digitCount(12345);

        System.out.println("Number of Digits = " + result);
    }
}