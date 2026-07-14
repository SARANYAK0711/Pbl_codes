package com.wipro.datetime;

import java.time.LocalDate;
import java.time.Period;

public class Experience {

    public static void main(String[] args) {

        LocalDate joiningDate = LocalDate.of(2022, 1, 10); // Change joining date
        LocalDate today = LocalDate.now();

        Period p = Period.between(joiningDate, today);

        System.out.println("Experience:");
        System.out.println("Years : " + p.getYears());
        System.out.println("Months : " + p.getMonths());
        System.out.println("Days : " + p.getDays());
    }
}