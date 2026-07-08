package Oops;

import java.util.Scanner;

public class ShortLongShort {

    public String combine(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        ShortLongShort obj = new ShortLongShort();
        System.out.println(obj.combine(a, b));

        sc.close();
    }
}