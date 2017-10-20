package br.com.abc.javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * Created by William Suane on 7/1/2016.
 */
public class DateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] dfa = new DateFormat[6];
        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat df : dfa){
            System.out.println(df.format(c.getTime()));
        }
    }
}
