package Oops;

import java.util.Scanner;

public class RemoveX {

    public String removeX(String s) {
        if (s.startsWith("x")) {
            s = s.substring(1);
        }

        if (s.endsWith("x")) {
            s = s.substring(0, s.length() - 1);
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        RemoveX obj = new RemoveX();
        System.out.println(obj.removeX(s));

        sc.close();
    }
}