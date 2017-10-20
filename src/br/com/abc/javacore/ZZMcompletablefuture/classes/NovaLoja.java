package br.com.abc.javacore.ZZMcompletablefuture.classes;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import static java.util.Arrays.asList;

/**
 * Created by William Suane on 2/8/2017.
 */
public class NovaLoja {
    private String nome;

    public NovaLoja(String nome) {
        this.nome = nome;
    }

    public NovaLoja() {
    }

    // NomeDaLoja:Preco:CodigoDeDesconto
    public String getPreco() {
        double preco = calcularPreco();
        Desconto.Codigo codigo = Desconto.Codigo.values()[
                ThreadLocalRandom.current().nextInt(Desconto.Codigo.values().length)];
        return String.format("%s:%.2f:%s", nome, preco, codigo);
    }


    private double calcularPreco() {
        delay();
        return ThreadLocalRandom.current().nextDouble() * 100;
    }

    private static void delay() {
        try {
            int delay = ThreadLocalRandom.current().nextInt(500, 2000);
            TimeUnit.MILLISECONDS.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getNome() {
        return nome;
    }

    public static List<NovaLoja> lojas() {
        return asList(
                new NovaLoja("americanas"),
                new NovaLoja("casas bahia"),
                new NovaLoja("bestbuy"),
                new NovaLoja("Amazon"));
    }
}
