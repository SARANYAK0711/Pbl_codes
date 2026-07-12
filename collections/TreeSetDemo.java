package com.wipro.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<String>();

        ts.add("India");
        ts.add("USA");
        ts.add("Japan");
        ts.add("Australia");
        ts.add("Canada");

        // a) Reverse the elements
        System.out.println("TreeSet in Reverse Order:");
        Iterator<String> rev = ts.descendingIterator();

        while (rev.hasNext()) {
            System.out.println(rev.next());
        }

        // b) Iterate using Iterator
        System.out.println("\nTreeSet using Iterator:");
        Iterator<String> itr = ts.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // c) Check if an element exists
        String search = "India";

        if (ts.contains(search)) {
            System.out.println("\n" + search + " exists in the TreeSet.");
        } else {
            System.out.println("\n" + search + " does not exist in the TreeSet.");
        }
    }
}