package com.wipro.collectionsproject;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectAndGroupCards {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<GroupCard>> map = new LinkedHashMap<>();

        System.out.print("Enter number of cards: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Card " + i);

            System.out.print("Enter Symbol: ");
            String symbol = sc.next();

            System.out.print("Enter Number: ");
            int number = sc.nextInt();

            GroupCard card = new GroupCard(symbol, number);

            if (!map.containsKey(symbol)) {
                map.put(symbol, new ArrayList<GroupCard>());
            }

            map.get(symbol).add(card);
        }

        System.out.println("\nCards Grouped By Symbol");

        for (Map.Entry<String, ArrayList<GroupCard>> entry : map.entrySet()) {

            System.out.println("\nSymbol : " + entry.getKey());

            int sum = 0;

            for (GroupCard c : entry.getValue()) {
                System.out.println(c);
                sum += c.getNumber();
            }

            System.out.println("Total Cards : " + entry.getValue().size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}