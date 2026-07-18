package com.wipro.day3;

public class Odd {

    public static int isOdd(int number) {
        if (number % 2 != 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(9));
        System.out.println(isOdd(8));
        System.out.println(isOdd(0));
    }
}