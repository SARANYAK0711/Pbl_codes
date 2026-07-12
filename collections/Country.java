package com.wipro.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Country {

    HashSet<String> H1 = new HashSet<String>();

    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    public String getCountry(String CountryName) {

        Iterator<String> itr = H1.iterator();

        while (itr.hasNext()) {
            String country = itr.next();

            if (country.equalsIgnoreCase(CountryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Country c = new Country();

        c.saveCountryNames("India");
        c.saveCountryNames("USA");
        c.saveCountryNames("Japan");
        c.saveCountryNames("Australia");

        System.out.println("Countries in HashSet:");
        System.out.println(c.H1);

        System.out.println("\nSearching Countries:");

        System.out.println("India : " + c.getCountry("India"));
        System.out.println("Japan : " + c.getCountry("Japan"));
        System.out.println("Canada : " + c.getCountry("Canada"));
    }
}