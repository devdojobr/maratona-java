package br.com.abc.javacore.ZZNdatetime.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

/**
 * Created by William Suane on 2/27/2017.
 */
public class DateTimeAPITest6 {
    public static void main(String[] args) {
        for(Map.Entry<String, String> zonas : ZoneId.SHORT_IDS.entrySet()){
            System.out.println(zonas.getKey() + " "+zonas.getValue());
        }
        System.out.println("-------------");
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        ZonedDateTime zonedDateTime = dateTime.atZone(tokyoZone);
        System.out.println(zonedDateTime);
        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime2 = instant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        ZoneOffset manausOffset = ZoneOffset.of("-04:00");
        LocalDateTime dateTime2= LocalDateTime.now();
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime2, manausOffset);
        System.out.println(offsetDateTime);
        OffsetDateTime offsetDateTime2 = dateTime2.atOffset(manausOffset);
        System.out.println(offsetDateTime2);
        Instant instant2 = Instant.now();
        System.out.println(instant2.atOffset(manausOffset));

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate antigamente = LocalDate.of(1900, 2, 1);
        System.out.println(JapaneseDate.from(antigamente));

    }
}
