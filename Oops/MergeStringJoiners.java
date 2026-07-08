package Oops;

import java.util.Scanner;
import java.util.StringJoiner;

public class MergeStringJoiners {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of cities
        int n = sc.nextInt();
        sc.nextLine();

        StringJoiner s1 = new StringJoiner("-");
        StringJoiner s2 = new StringJoiner("-");

        // Read cities for s1
        for (int i = 0; i < n; i++) {
            s1.add(sc.nextLine());
        }

        // Read cities for s2
        for (int i = 0; i < n; i++) {
            s2.add(sc.nextLine());
        }

        // Case 1: s1 merged to s2
        StringJoiner merge1 = new StringJoiner("-");
        merge1.merge(s2);
        merge1.merge(s1);
        System.out.println("s1 merged to s2: " + merge1);

        // Case 2: s2 merged to s1
        StringJoiner merge2 = new StringJoiner("-");
        merge2.merge(s1);
        merge2.merge(s2);
        System.out.println("s2 merged to s1: " + merge2);

        sc.close();
    }
}