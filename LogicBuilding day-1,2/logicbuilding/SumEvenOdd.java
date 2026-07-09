package logicbuilding;

import java.util.Scanner;

public class SumEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        int sum = first + second;

        if (sum % 2 == 0) {
            System.out.println("Sum = " + sum);
            System.out.println("The sum is Even.");
        } else {
            System.out.println("Sum = " + sum);
            System.out.println("The sum is Odd.");
        }

        sc.close();
    }
}