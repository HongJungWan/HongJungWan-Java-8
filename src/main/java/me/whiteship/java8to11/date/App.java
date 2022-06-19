package me.whiteship.java8to11.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Date date = new Date();

        Instant instant = date.toInstant(); // Date -> Instant
        Date newDate = Date.from(instant);  // Instant -> Date

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        LocalDateTime dateTime = gregorianCalendar
                .toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        // GregorianCalendar -> LocalDateTime

        GregorianCalendar from = GregorianCalendar.from(ZonedDateTime.now());
        // ZonedDateTime -> GregorianCalendar
    }
}
