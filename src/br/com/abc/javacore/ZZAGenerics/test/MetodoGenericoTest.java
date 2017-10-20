package br.com.abc.javacore.ZZAGenerics.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by William Suane on 9/14/2016.
 */
public class MetodoGenericoTest {
    public static void main(String[] args) {
        criarArray(new Cachorro());
    }

    public static <T extends Animal> void criarArray(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }
}
