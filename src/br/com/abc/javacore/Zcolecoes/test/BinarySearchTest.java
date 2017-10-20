package br.com.abc.javacore.Zcolecoes.test;

import br.com.abc.javacore.Zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by William Suane on 9/7/2016.
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        // (-(ponto de inserção) -1), -1 -1 = -2
        Collections.sort(numeros);
        //0,1,2,3
        //0,2,3,4
        System.out.println(Collections.binarySearch(numeros, 1));

        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
        Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Collections.sort(produtos, new ProdutoNomeComparator());
        Produto produto5 = new Produto("000", "Antena", 50);
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.println(Collections.binarySearch(produtos, produto5, new ProdutoNomeComparator()));
        Integer[] arrayInteger = new Integer[4];
        arrayInteger[0] = 2;
        arrayInteger[1] = 0;
        arrayInteger[2] = 4;
        arrayInteger[3] = 3;
        Arrays.sort(arrayInteger);
        System.out.println(Arrays.binarySearch(arrayInteger,1));
    }
}
