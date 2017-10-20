package br.com.abc.javacore.Zcolecoes.test;

import br.com.abc.javacore.Zcolecoes.classes.Produto;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by William Suane on 9/8/2016.
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<Produto> produtos = new LinkedList<>();
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 10d, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
        Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5, 0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Iterator<Produto> produtoIterator = produtos.iterator();
        while (produtoIterator.hasNext()) {
            if (produtoIterator.next().getQuantidade() == 0) {
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());

    }
}
