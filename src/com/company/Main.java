package com.company;

import java.time.*;

public class Main {

    public static void main(String[] args) {
            DatePattern datePattern = new DatePattern();

            LocalDate startDate = LocalDate.of(2022, 3, 14);
            LocalTime startTime = LocalTime.of(22, 5, 32);

            LocalDate endDate = LocalDate.now();
            LocalTime endTime = LocalTime.now();

            Period period = Period.ofDays(7); // 7 days of the week

            Duration duration = Duration.ofHours(8); // 8 hours of the day


            datePattern.replacement(LocalDateTime.of(startDate, startTime), LocalDateTime.of(endDate, endTime), period, duration);
    }
}
