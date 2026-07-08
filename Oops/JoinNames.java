package Oops;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class JoinNames {

    // Method to join names
    public String joinNames(ArrayList<String> names) {
        StringJoiner sj = new StringJoiner(", ", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        return sj.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter number of names
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        ArrayList<String> names = new ArrayList<>();

        // Read names
        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        // Create object
        JoinNames obj = new JoinNames();

        // Display result
        System.out.println(obj.joinNames(names));

        sc.close();
    }
}