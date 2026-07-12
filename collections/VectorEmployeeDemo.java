package com.wipro.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEmployeeDemo {

    public static void main(String[] args) {

        Vector<Employee> list = new Vector<Employee>();

        list.add(new Employee(101, "Rahul", "rahul@gmail.com", "Male", 45000));
        list.add(new Employee(102, "Priya", "priya@gmail.com", "Female", 50000));
        list.add(new Employee(103, "Kiran", "kiran@gmail.com", "Male", 55000));

        System.out.println("Using Iterator");

        Iterator<Employee> itr = list.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();
            e.GetEmployeeDetails();
            System.out.println("----------------------");
        }

        System.out.println("\nUsing Enumeration");

        Enumeration<Employee> en = list.elements();

        while (en.hasMoreElements()) {
            Employee e = en.nextElement();
            e.GetEmployeeDetails();
            System.out.println("----------------------");
        }
    }
}