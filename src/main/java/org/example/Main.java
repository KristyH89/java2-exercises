package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.Period;
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

        LocalDate parseDate = LocalDate.parse("2026-03-04");

        System.out.println("Parse LocalDate: " + parseDate);

// Exercise 5 - Day of the Week

    LocalDate birthday = LocalDate.of(1989,10,31);
    DayOfWeek dayOfWeek = birthday.getDayOfWeek();

    System.out.println("Birthday: " + birthday);
    System.out.println("Day of week: " + dayOfWeek);

// Exercise 6 - Future and Past Date
    LocalDate futureDate = today.plusYears(10).minusMonths(10);
    Month month = futureDate.getMonth();

    System.out.println("Furture Date: " + futureDate);
    System.out.println("Month: " + month);

// Exercise 7 - Period Between Dates
    Period age = Period.between(birthday, futureDate);
    System.out.println("Elapsed time:");
    System.out.println("Years: " + age.getYears());
    System.out.println("Months: " + age.getMonths());
    System.out.println("Days: " + age.getDays());

// Exercise 8 - Add Period to Current Date
    Period period = Period.of(4,7,29);
    System.out.println("Today: " + today);

    LocalDate futureDate2 = today.plus(period);
    System.out.println("Future date after adding period: " + futureDate2);


// Exercise 9 - Current Time
       LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);

// Exercise 10 - Nanoseconds of LocalTime

int nanos = now.getNano();
System.out.println("Current time: " + now);
System.out.println("Nanoseconds: " + nanos);

// Exercise 11 - Parse Time from String

// Exercise 12 - Formatted Current Time

// Exercise 13 - Specific LocalDateTime

// Exercise 14 - Formatted LocalDateTime

// Exercise 15 - Combine Date and Time

// Exercise 16 - Extract Components from LocalDateTime














    }

}


