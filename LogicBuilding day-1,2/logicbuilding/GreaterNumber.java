package logicbuilding;

import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        if (first > second) {
            System.out.println("Greater number is: " + first);
        } else if (second > first) {
            System.out.println("Greater number is: " + second);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}