package com.company;

import java.time.*;
import java.time.format.*;

public class DatePattern {
    private static final DateTimeFormatter dateTimeFormatterFromBeginning = DateTimeFormatter.ofPattern("YYYY,MMMM-dd !! mm:ss");
    private static final DateTimeFormatter dateTimeFormatterFromEnd = DateTimeFormatter.ofPattern("mm:ss, dd/MMM/YY");

    public DatePattern() {}

    public void replacement(LocalDateTime start, LocalDateTime end, Period period, Duration duration) {
            while (start.isBefore(end)) {
                System.out.println("Working with : " + dateTimeFormatterFromBeginning.format(start));
                start = start.plus(period);
                System.out.println("Until : " + dateTimeFormatterFromBeginning.format(start));
                System.out.println("Having a rest with : " + dateTimeFormatterFromEnd.format(start));
                start = start.plus(duration);
                System.out.println("Until : " + dateTimeFormatterFromEnd.format(start));
            }
    }
}
