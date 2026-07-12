package com.wipro.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {

    public static void printAll(ArrayList<String> list) {

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("Grapes");

        printAll(list);
    }
}