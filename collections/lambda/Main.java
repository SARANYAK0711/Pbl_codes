package com.wipro.lambda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        // Adding 5 Student objects
        list.add(new Student(101, "Saranya", 85));
        list.add(new Student(102, "Anu", 45));
        list.add(new Student(103, "Rahul", 70));
        list.add(new Student(104, "Priya", 50));
        list.add(new Student(105, "Kiran", 35));

        int count = 0;

        System.out.println("Students who cleared the test:");

        for (Student s : list) {
            if (s.mark >= 50) {
                System.out.println("Roll No: " + s.rollNo +
                        ", Name: " + s.name +
                        ", Mark: " + s.mark);
                count++;
            }
        }

        System.out.println("\nNumber of students cleared: " + count);
    }
}