package br.com.abc.javacore.Zcolecoes.test;

import br.com.abc.javacore.Zcolecoes.classes.Celular;
import br.com.abc.javacore.Zcolecoes.classes.Produto;

import java.util.*;

/**
 * Created by William Suane on 9/8/2016.
 */

public class TreeSetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 10d, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
        Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5, 0);
        Produto produto5 = new Produto("023", "Samsung galaxy S6 64Gb", 1d, 0);
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);

        for(Produto produto : produtoNavigableSet.descendingSet()){
            System.out.println(produto);
        }
        System.out.println("--------------------");
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollLast());
        System.out.println(produtoNavigableSet.size());
    }
}
