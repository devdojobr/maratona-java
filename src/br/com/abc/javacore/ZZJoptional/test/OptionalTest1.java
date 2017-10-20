package br.com.abc.javacore.ZZJoptional.test;

import java.util.Optional;

/**
 * Created by William Suane on 12/7/2016.
 */
public class OptionalTest1 {
    private String nome;

    public static void main(String[] args) {
        OptionalTest1 ot = new OptionalTest1();
        Optional<String> optional1 = Optional.of("DevDojo");
        Optional<String> optional2 = Optional.empty();
        Optional<String> optional3 = Optional.ofNullable(ot.nome);
        // Imprimindo
        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
        // Buscando valores
        System.out.println(optional1.orElse("vazio"));
        System.out.println(optional2.orElse("vazio"));
        System.out.println(optional3.orElse("vazio"));

//        System.out.println(ot.nome.toUpperCase());
    }
}
