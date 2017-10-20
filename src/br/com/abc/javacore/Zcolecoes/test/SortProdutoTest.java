package br.com.abc.javacore.Zcolecoes.test;

import br.com.abc.javacore.Zcolecoes.classes.Produto;

import java.util.*;

/**
 * Created by William Suane on 9/6/2016.
 */
class ProdutoNomeComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto[] produtosArray =  new Produto[4];

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
        Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        produtosArray[0] = produto1;
        produtosArray[1] = produto2;
        produtosArray[2] = produto3;
        produtosArray[3] = produto4;

        Collections.sort(produtos,new ProdutoNomeComparator());
//        for (Produto produto : produtos) {
//            System.out.println(produto);
//        }
        Arrays.sort(produtosArray, new ProdutoNomeComparator());
        for (Produto produto : produtosArray) {
            System.out.println(produto);
        }
    }
}
