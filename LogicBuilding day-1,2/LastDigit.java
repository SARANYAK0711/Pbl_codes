package com.wipro.day3;

public class LastDigit {

    public static int getLastDigit(int number) {
        return Math.abs(number % 10);
    }

    public static void main(String[] args) {
        System.out.println(getLastDigit(197));
        System.out.println(getLastDigit(-197));
    }
}