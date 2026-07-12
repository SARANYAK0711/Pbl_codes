package com.wipro.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("101", "Rahul");
        map.put("102", "Priya");
        map.put("103", "Kiran");
        map.put("104", "Anjali");

        // a) Check if a key exists
        if (map.containsKey("102")) {
            System.out.println("Key 102 exists.");
        } else {
            System.out.println("Key 102 does not exist.");
        }

        // b) Check if a value exists
        if (map.containsValue("Priya")) {
            System.out.println("Value Priya exists.");
        } else {
            System.out.println("Value Priya does not exist.");
        }

        // c) Iterate using Iterator
        System.out.println("\nHashMap Elements:");

        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}