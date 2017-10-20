package br.com.abc.javacore.Zcolecoes.test;

import br.com.abc.javacore.Zcolecoes.classes.Celular;

/**
 * Created by William Suane on 8/24/2016.
 */
public class EqualsTest {
    public static void main(String[] args) {
        String nome1 = "William Suane";
        String nome2 = new String("William Suane");
        Integer int1 = 5;
        Integer int2 = new Integer(5);
        System.out.println(nome1.equals(nome2));
        System.out.println(int1.equals(int2));

        Celular c1 = new Celular("iPhone", "1234");
        Celular c2 = new Celular("iPhone", "1234");
        System.out.println(c2.equals(c1));
    }
}
