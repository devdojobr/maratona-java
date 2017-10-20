package br.com.abc.javacore.Zcolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by William Suane on 9/7/2016.
 */
public class ConversaoDeListasArraysTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        Integer[] numerosArray = new Integer[numeros.size()];
        numeros.toArray(numerosArray);
        System.out.println(numeros);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println("-----------------------");
        Integer[] numerosArray2 = new Integer[4];
        numerosArray2[0] = 10;
        numerosArray2[1] = 9;
        numerosArray2[2] = 8;
        numerosArray2[3] = 7;
        List<Integer> numeros2 = Arrays.asList(numerosArray2);

        List<Integer> numeros3 = new ArrayList<>();
        numeros3.addAll(Arrays.asList(numerosArray2));

        numeros2.set(0,1);
        numeros3.add(10);
        System.out.println(Arrays.toString(numerosArray2));
        System.out.println(numeros2);
        System.out.println(numeros3);

    }
}
