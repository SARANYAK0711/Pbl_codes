package com.wipro.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SecondSunday {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now().plusMonths(1).withDayOfMonth(1);

        int count = 0;

        while (true) {

            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                count++;
            }

            if (count == 2) {
                break;
            }

            date = date.plusDays(1);
        }

        System.out.println("Second Sunday of Next Month: " + date);
    }
}