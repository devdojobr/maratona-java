package br.com.abc.javacore.Tdatas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by William Suane on 7/7/2016.
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "'Atlanta,' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));

    }
}
