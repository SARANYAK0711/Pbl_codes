package Oops;

import java.util.Scanner;

public class ConcatenateStrings {

    public String concatenate(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            return s1 + s2.substring(1);
        } else {
            return s1 + s2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        ConcatenateStrings obj = new ConcatenateStrings();
        System.out.println(obj.concatenate(s1, s2));

        sc.close();
    }
}