package com.wipro.collectionsproject;

import java.util.ArrayList;

public class StringArrayListOperations {

    public static void main(String[] args) {

        String s1 = "JAVAJAVA";
        String s2 = "VA";

        ArrayList<String> result = new ArrayList<>();

        // 1. Replace alternate occurrence
        String temp = s1;
        boolean replace = true;

        while (temp.contains(s2)) {
            if (replace)
                temp = temp.replaceFirst(s2, s2.toLowerCase());
            else
                temp = temp.replaceFirst(s2, s2);

            replace = !replace;
        }

        result.add(temp.toUpperCase());

        // 2. Replace last occurrence with reverse
        int index = s1.lastIndexOf(s2);

        if (index != -1) {
            String rev = new StringBuilder(s2).reverse().toString();
            String str = s1.substring(0, index) + rev + s1.substring(index + s2.length());
            result.add(str);
        }

        // 3. Delete first occurrence
        result.add(s1.replaceFirst(s2, ""));

        // 4. Divide S2 into two halves and insert
        int mid = s2.length() / 2;

        String first = s2.substring(0, mid);
        String second = s2.substring(mid);

        result.add(first + s1 + second);

        // 5. Replace matching characters with *
        String stars = s1;

        for (char c : s2.toCharArray()) {
            stars = stars.replace(c, '*');
        }

        result.add(stars);

        System.out.println("Output:");
        for (String s : result)
            System.out.println(s);
    }
}