package br.com.abc.javacore.ZZNdatetime.test;

import br.com.abc.javacore.Gassociacao.classes.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by William Suane on 2/15/2017.
 */
public class DateTimeAPITest1 {
    public static void main(String[] args) {
//        System.out.println(new Date());
//        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2020, Month.DECEMBER, 25);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        LocalDate now = LocalDate.now();
        System.out.println(date);
        System.out.println(now);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println("---------LocalTime---------");
        LocalTime time = LocalTime.of(22,2,15);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(time);
        System.out.println("---------Parsing---------");
        LocalDate parseDate = LocalDate.parse("2017-02-15");
        LocalTime parseTime = LocalTime.parse("23:25:10");
        System.out.println(parseDate);
        System.out.println(parseTime);
        System.out.println("---------LocalDateTime---------");
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2017,8,6,8,35,33);
        LocalDateTime ldt3 = date.atTime(10,20,20);
        LocalDateTime ldt4 = date.atTime(time);
        LocalDateTime ldt5 = time.atDate(LocalDate.now());
        LocalDateTime ldt6 = time.atDate(date);

        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
        System.out.println(ldt4);
        System.out.println(ldt5);
        System.out.println(ldt6);

    }
}
