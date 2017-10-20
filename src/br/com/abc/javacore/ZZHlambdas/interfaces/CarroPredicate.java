package br.com.abc.javacore.ZZHlambdas.interfaces;


import br.com.abc.javacore.ZZHlambdas.classes.Carro;

/**
 * Created by William Suane on 11/18/2016.
 */
@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
    // (parametro) -> <expressao>
    // (Carro carro) -> carro.getCor().equals("verde");
}
