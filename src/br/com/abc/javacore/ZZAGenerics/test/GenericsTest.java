package br.com.abc.javacore.ZZAGenerics.test;

import br.com.abc.javacore.Zcolecoes.classes.Consumidor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by William Suane on 9/12/2016.
 */
public class GenericsTest {
    public static void main(String[] args) {
        // type erasure
        List<String> lista = new ArrayList<>();
        lista.add("String");
        lista.add("String");
        lista.add("William Suane");

        for (String obj : lista) {
            System.out.println(obj);
        }
        add(lista, 1L);
    }

    public static void add(List lista, Long l) {
        lista.add(l);
    }
}
