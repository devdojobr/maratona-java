package br.com.abc.javacore.ZZNdatetime.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Created by William Suane on 2/21/2017.
 */
public class DateTimeAPITest5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        String s4 = "20170221";
        String s5 = "2017-02-21+05:00";
        LocalDate parse1 = LocalDate.parse(s4,DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse(s5,DateTimeFormatter.ISO_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        LocalDateTime dateTime = LocalDateTime.now();
        String s6 = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s6);
        LocalDateTime parse = LocalDateTime.parse("2017-02-21T13:07:40.433");
        System.out.println(parse);
        //dd/MM/yyyy
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        String dataBRString = "01/12/2017";
        LocalDate parse3 = LocalDate.parse(dataBRString, formatterBR);
        System.out.println(parse3);
        DateTimeFormatter formatterFR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRANCE);
        String formatFR = LocalDate.now().format(formatterFR);
        System.out.println(formatFR);
        LocalDate parse4 = LocalDate.parse("21.février.2017", formatterFR);
        System.out.println(parse4);
    }
}
