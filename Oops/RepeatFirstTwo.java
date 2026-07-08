package Oops;

import java.util.Scanner;

public class RepeatFirstTwo {

    public String repeat(String s) {
        String first = s.substring(0, 2);
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            result += first;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        RepeatFirstTwo obj = new RepeatFirstTwo();
        System.out.println(obj.repeat(s));

        sc.close();
    }
}