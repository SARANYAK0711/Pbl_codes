package com.wipro.collections;

public class TestEmployee {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Rahul", "rahul@gmail.com", "Male", 45000);
        Employee e2 = new Employee(102, "Priya", "priya@gmail.com", "Female", 50000);
        Employee e3 = new Employee(103, "Kiran", "kiran@gmail.com", "Male", 55000);

        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

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