package br.com.abc.javacore.ZZFpadroesdeprojeto.test;

import br.com.abc.javacore.ZZFpadroesdeprojeto.classes.Aviao;

/**
 * Created by William Suane on 11/11/2016.
 */
public class AviaoTest {
    public static void main(String[] args) {
        agendarAssento("1A");
        agendarAssento("1A");
    }

    private static void agendarAssento(String assento) {
        Aviao a = new Aviao();
        System.out.println(a.bookAssento(assento));
    }
}
