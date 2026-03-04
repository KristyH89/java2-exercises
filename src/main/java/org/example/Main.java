package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Main {
    static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Exercise 1 - Current Date
        System.out.println("Today: " + today);


        // Exercise 2 - Formatted Current Date
        /*
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee dd MMMM", new Locale("sv", "SE"));
        String formattedTime = today.format(formatter);

        System.out.println("Formatted Date: " + formattedTime);

         */

        // Exercise 3 - Last Monday and the Entire Week
        LocalDate lastMonday = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));

        System.out.println("Last Monday: "+ lastMonday);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;

        System.out.println("Week Starting from last Monday");
        for (int i = 0; i < 7; i++) {
            LocalDate day = lastMonday.plusDays(i);
            System.out.println(day.format(formatter));
        }



        // Exercise 4 - Parse Date from String

        // Exercise 5 - Day of the Week

        // Exercise 6 - Future and Past Date

        // Exercise 7 - Period Between Dates

        // Exercise 8 - Add Period to Current Date

        // Exercise 9 - Current Time

        // Exercise 10 - Nanoseconds of LocalTime

        // Exercise 11 - Parse Time from String

        // Exercise 12 - Formatted Current Time

        // Exercise 13 - Specific LocalDateTime

        // Exercise 14 - Formatted LocalDateTime

        // Exercise 15 - Combine Date and Time

        // Exercise 16 - Extract Components from LocalDateTime














    }

}


