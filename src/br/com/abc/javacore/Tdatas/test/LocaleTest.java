package br.com.abc.javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by William Suane on 7/6/2016.
 */
public class LocaleTest {
    public static void main(String[] args) {
        //ISO 639 pt= portugues BR - Brazil, en - ingles, US - Estados Unidos
        Locale locItaly = new Locale("it", "IT");
        Locale locSuica = new Locale("it", "CH");
        Locale locIndia = new Locale("hi", "IN");
        Locale locJapao = new Locale("ja");

        Calendar c = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locJapao);

        System.out.println("Italia " + df.format(c.getTime()));
        System.out.println("Suica " + df2.format(c.getTime()));
        System.out.println("India " + df3.format(c.getTime()));
        System.out.println("Japao " + df4.format(c.getTime()));
        //1.000,00 , 1,000.00
        System.out.println(locItaly.getDisplayLanguage(locJapao));
        System.out.println(locJapao.getDisplayLanguage(locItaly));
        System.out.println(locSuica.getDisplayCountry(locItaly));
    }
}
