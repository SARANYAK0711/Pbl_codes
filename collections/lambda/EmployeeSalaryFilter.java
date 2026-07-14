package com.wipro.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeSalaryFilter {

    public static void main(String[] args) {

        ArrayList<EmployeeSalary> list = new ArrayList<>();

        list.add(new EmployeeSalary(101, "Ram", 8000));
        list.add(new EmployeeSalary(102, "Anu", 12000));
        list.add(new EmployeeSalary(103, "Kiran", 9500));
        list.add(new EmployeeSalary(104, "Priya", 15000));
        list.add(new EmployeeSalary(105, "Ravi", 7000));

        Predicate<EmployeeSalary> p = e -> e.salary < 10000;

        System.out.println("Employees with Salary Less Than 10000:");

        for (EmployeeSalary e : list) {
            if (p.test(e)) {
                System.out.println(
                        "Emp No: " + e.empNo +
                        ", Name: " + e.name +
                        ", Salary: " + e.salary);
            }
        }
    }
}