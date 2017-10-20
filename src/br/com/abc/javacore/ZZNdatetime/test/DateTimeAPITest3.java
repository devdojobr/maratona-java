package br.com.abc.javacore.ZZNdatetime.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * Created by William Suane on 2/17/2017.
 */
public class DateTimeAPITest3 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2017, Month.FEBRUARY,25);
        System.out.println(localDate);
        localDate = localDate.withYear(2020);
        System.out.println(localDate);
        localDate = localDate.withMonth(Month.AUGUST.getValue());
        System.out.println(localDate);
        localDate = localDate.withDayOfMonth(20);
        System.out.println(localDate);
        localDate = localDate.with(ChronoField.DAY_OF_MONTH, 15);
        System.out.println(localDate);
        localDate = localDate.plusMonths(5);
        System.out.println(localDate);
        localDate = localDate.plus(2, ChronoUnit.MONTHS);
        System.out.println(localDate);
        localDate = localDate.plusMonths(2).minusDays(20);
        System.out.println(localDate);

        LocalTime time = LocalTime.now();
        System.out.println(time);
        time = time.withHour(10);
        System.out.println(time);
        time = time.plusHours(15);
        System.out.println(time);
        time = time.plusHours(5).minusMinutes(30);
        System.out.println(time);

    }
}
