package com.wipro.lambda;

import java.util.ArrayList;

public class EmployeeFilter {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee(101, "Rahul", 25, "Pune"));
        list.add(new Employee(102, "Priya", 24, "Hyderabad"));
        list.add(new Employee(103, "Kiran", 26, "Pune"));
        list.add(new Employee(104, "Anjali", 23, "Chennai"));
        list.add(new Employee(105, "Ravi", 27, "Pune"));

        ArrayList<Employee> puneList = new ArrayList<Employee>();

        // Lambda Expression
        list.forEach(emp -> {
            if (emp.location.equalsIgnoreCase("Pune")) {
                puneList.add(emp);
            }
        });

        System.out.println("Employees from Pune:");

        puneList.forEach(emp -> System.out.println(emp));
    }
}