package br.com.abc.javacore.ZZNdatetime.test;

import br.com.abc.javacore.ZZNdatetime.util.ObterProximoDiaUtil;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by William Suane on 2/21/2017.
 */
public class DateTimeAPITest4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        date = date.with(new ObterProximoDiaUtil());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.plusDays(4);
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(new ObterProximoDiaUtil());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

    }
}
