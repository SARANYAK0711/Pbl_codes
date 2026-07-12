package com.wipro.collections;

public class TestEmployeeVector {

    public static void main(String[] args) {

        EmployeeDBVector db = new EmployeeDBVector();

        db.addEmployee(new Employee(101, "Rahul", "rahul@gmail.com", "Male", 45000));
        db.addEmployee(new Employee(102, "Priya", "priya@gmail.com", "Female", 50000));
        db.addEmployee(new Employee(103, "Kiran", "kiran@gmail.com", "Male", 55000));

        System.out.println("Employee Details");
        db.showAllEmployees();

        System.out.println(db.showPaySlip(102));

        if (db.deleteEmployee(101))
            System.out.println("Employee Deleted Successfully");
        else
            System.out.println("Employee Not Found");

        System.out.println("\nAfter Deletion");

        db.showAllEmployees();
    }
}