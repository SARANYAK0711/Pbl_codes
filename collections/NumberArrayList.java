package com.wipro.collections;

import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<Number>();

        list.add(10);        // Integer
        list.add(25.5f);     // Float
        list.add(99.99);     // Double
        list.add(100L);      // Long
        list.add((short)5);  // Short
        list.add((byte)2);   // Byte

        System.out.println("Numbers in the ArrayList:");

        for (Number num : list) {
            System.out.println(num);
        }

        // The following statement is not allowed
        // list.add("Hello"); // Compile-time error
    }
}