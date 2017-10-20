package br.com.abc.javacore.Tdatas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by William Suane on 7/6/2016.
 */
public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 212.4567f;
        Locale locJP = new Locale("jp");
        Locale locFR = new Locale("fr");
        Locale locIT = new Locale("it");
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locIT);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locIT);
        for(NumberFormat nf : nfa){
            System.out.println(nf.format(valor));
        }
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.getMaximumFractionDigits());
        nf.setMaximumFractionDigits(1);
        System.out.println(nf.format(valor));
        String valorString = "212.4567";
        try {
            System.out.println(nf.parse(valorString));
            nf.setParseIntegerOnly(true);
            System.out.println(nf.parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
