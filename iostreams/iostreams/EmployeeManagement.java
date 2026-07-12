package com.wipro.iostreams;

import java.io.*;
import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:

                try {
                    FileWriter fw = new FileWriter("employee.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    bw.write(id + " " + name + " " + age + " " + salary);
                    bw.newLine();

                    bw.close();

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

                break;

            case 2:

                try {
                    FileReader fr = new FileReader("employee.txt");
                    BufferedReader br = new BufferedReader(fr);

                    String line;

                    System.out.println("------Report------");

                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }

                    System.out.println("------End of Report------");

                    br.close();

                } catch (IOException e) {
                    System.out.println("File not found.");
                }

                break;

            case 3:

                System.out.println("Exiting the System");
                sc.close();
                System.exit(0);

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}