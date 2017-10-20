package br.com.abc.javacore.ZZMcompletablefuture.test;

import br.com.abc.javacore.ZZMcompletablefuture.classes.Loja;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by William Suane on 1/26/2017.
 */
public class LojaTest {
    public static void main(String[] args) {
        Loja americanas = new Loja();
        Loja casasBahia = new Loja();
        Loja bestBuy = new Loja();
        Loja wallmart = new Loja();
//        long start = System.currentTimeMillis();
//        System.out.println(americanas.getPreco());
//        System.out.println(casasBahia.getPreco());
//        System.out.println(bestBuy.getPreco());
//        System.out.println(wallmart.getPreco());
//        System.out.println(System.currentTimeMillis() - start +" ms");
        long start = System.currentTimeMillis();
        Future<Double> precoAsync = americanas.getPrecoAsyncTunado();
        Future<Double> precoAsync1 = casasBahia.getPrecoAsyncTunado();
        Future<Double> precoAsync2 = bestBuy.getPrecoAsyncTunado();
        Future<Double> precoAsync3 = wallmart.getPrecoAsyncTunado();
        long end = System.currentTimeMillis();
        System.out.println("Tempo de invocação: " + (end - start) + " ms");
        enrolando();
        try {
            System.out.println("Americanas "+precoAsync.get());
            System.out.println("casasBahia "+precoAsync1.get());
            System.out.println("bestBuy "+precoAsync2.get());
            System.out.println("wallmart "+precoAsync3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Tempo que levou para pegar o resultado: "+ (System.currentTimeMillis()-start) +" ms");
    }

    private static void enrolando() {
        long soma = 0;
        for (int i = 0; i < 1_000_000; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
