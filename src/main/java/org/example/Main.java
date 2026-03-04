package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Today: " + today);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee dd MMMM", new Locale("sv", "SE"));
        String formattedTime = today.format(formatter);

        System.out.println("Formatted Date: " + formattedTime);
    }

}


