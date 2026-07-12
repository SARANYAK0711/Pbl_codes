package io;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileWordCount {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        TreeMap<String, Integer> map = new TreeMap<>();

        try {
            Scanner file = new Scanner(new File(inputFile));

            while (file.hasNext()) {
                String word = file.next();

                if (map.containsKey(word))
                    map.put(word, map.get(word) + 1);
                else
                    map.put(word, 1);
            }

            file.close();

            PrintWriter writer = new PrintWriter(new FileWriter(outputFile));

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                writer.println(entry.getKey() + " : " + entry.getValue());
            }

            writer.close();

            System.out.println("Word count written to " + outputFile);

        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }
}