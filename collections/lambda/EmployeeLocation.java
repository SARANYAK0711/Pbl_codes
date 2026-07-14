package com.wipro.lambda;

import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeLocation {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ram", 25, "Chennai"));
        list.add(new Employee(102, "Anu", 28, "Hyderabad"));
        list.add(new Employee(103, "Kiran", 30, "Bangalore"));
        list.add(new Employee(104, "Priya", 27, "Mumbai"));
        list.add(new Employee(105, "Ravi", 32, "Delhi"));

        Function<Employee, String> f = e -> e.location;

        ArrayList<String> locations = new ArrayList<>();

        for (Employee e : list) {
            locations.add(f.apply(e));
        }

        System.out.println("Employee Locations:");
        System.out.println(locations);
    }
}