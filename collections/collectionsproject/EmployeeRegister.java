package com.wipro.collectionsproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeRegister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the Number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Employee " + i + " Details");

            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();

            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            employeeList.add(new Employee(firstName, lastName, mobile, email, address));
        }

        Collections.sort(employeeList);

        System.out.println("\nEmployee List");
        System.out.printf("%-15s %-15s %-15s %-30s %-15s%n",
                "FirstName", "LastName", "Mobile", "Email", "Address");

        for (Employee e : employeeList) {
            System.out.printf("%-15s %-15s %-15s %-30s %-15s%n",
                    e.getFirstName(),
                    e.getLastName(),
                    e.getMobileNumber(),
                    e.getEmail(),
                    e.getAddress());
        }

        sc.close();
    }
}