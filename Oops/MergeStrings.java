package Oops;

import java.util.Scanner;

public class MergeStrings {

    public String merge(String a, String b) {
        StringBuilder result = new StringBuilder();

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        result.append(a.substring(min));
        result.append(b.substring(min));

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        MergeStrings obj = new MergeStrings();
        System.out.println(obj.merge(a, b));

        sc.close();
    }
}