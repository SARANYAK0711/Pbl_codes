package Oops;

import java.util.Scanner;

public class RepeatLastN {

    public String repeatLast(String str, int n) {
        String last = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(last);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();   // First input
        int n = sc.nextInt();         // Second input

        RepeatLastN obj = new RepeatLastN();
        System.out.println(obj.repeatLast(str, n));

        sc.close();
    }
}