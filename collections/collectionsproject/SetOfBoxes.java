package com.wipro.collectionsproject;

import java.util.HashSet;
import java.util.Scanner;

public class SetOfBoxes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Box> boxSet = new HashSet<>();

        System.out.print("Enter the number of boxes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details of Box " + i);

            System.out.print("Length : ");
            double length = sc.nextDouble();

            System.out.print("Width : ");
            double width = sc.nextDouble();

            System.out.print("Height : ");
            double height = sc.nextDouble();

            Box box = new Box(length, width, height);

            if (boxSet.add(box)) {
                System.out.println("Box added successfully.");
            } else {
                System.out.println("Duplicate Box. Not Added.");
            }
        }

        System.out.println("\nUnique Boxes");

        for (Box b : boxSet) {
            System.out.println(b);
        }

        sc.close();
    }
}