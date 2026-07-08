package Oops;

import java.util.Scanner;

public class RemoveFirstLast {

    public String remove(String s) {
        return s.substring(1, s.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        RemoveFirstLast obj = new RemoveFirstLast();
        System.out.println(obj.remove(s));

        sc.close();
    }
}