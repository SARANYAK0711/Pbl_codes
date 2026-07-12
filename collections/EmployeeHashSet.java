package com.wipro.collections;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<String>();

        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Kiran");
        employees.add("Anjali");
        employees.add("Ravi");

        System.out.println("Employee Names:");

        Iterator<String> itr = employees.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}