package Oops;

import java.util.Scanner;

public class FirstHalf {

    public String getFirstHalf(String s) {
        if (s.length() % 2 == 0) {
            return s.substring(0, s.length() / 2);
        } else {
            return "null";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        FirstHalf obj = new FirstHalf();
        System.out.println(obj.getFirstHalf(s));

        sc.close();
    }
}