package br.com.abc.javacore.ZZHlambdas.test;


import br.com.abc.javacore.ZZHlambdas.classes.Carro;
import br.com.abc.javacore.ZZHlambdas.interfaces.CarroPredicate;

import java.util.function.Predicate;

/**
 * Created by William Suane on 11/21/2016.
 */
public class LambdaTest {
    // anonima    // function    // passada por ai    // concisa
    // (Carro carro) -> carro.getCor().equals("verde");
    // (String s ) -> s.length()
    // (int a, int b) -> {sout(a+b)}
    public static void main(String[] args) {
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        };
        Predicate<Carro> carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");
        System.out.println(carroPredicate.test(new Carro("verde", 2012)));
        System.out.println(carroPredicate2.test(new Carro("verde", 2012)));
        Runnable runnable = () -> System.out.println("Dentro do run");
        new Thread(runnable).start();
    }
}
