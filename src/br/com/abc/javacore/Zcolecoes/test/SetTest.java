package br.com.abc.javacore.Zcolecoes.test;

import br.com.abc.javacore.Zcolecoes.classes.Produto;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by William Suane on 9/8/2016.
 */
public class SetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 10d, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
        Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5, 0);
        Produto produto5 = new Produto("012", "Samsung galaxy S6 64Gb", 3250.5, 0);
        Set<Produto> produtoSet = new LinkedHashSet<>();
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);
        for(Produto p : produtoSet){
            System.out.println(p);
        }
    }
}
