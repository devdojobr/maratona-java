package br.com.abc.javacore.ZZHlambdas.test;

import br.com.abc.javacore.ZZHlambdas.classes.Carro;
import br.com.abc.javacore.ZZHlambdas.classes.ComparadorCarro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

import static java.util.Arrays.asList;

/**
 * Created by William Suane on 12/1/2016.
 */
public class LambdaTest3 {
    public static void main(String[] args) {
        forEach(asList("William", "DevDojo", "facebook.com/devdojobr"), System.out::println);
        List<Carro> carros = asList(new Carro("Vermelho", 1999), new Carro("Azul", 2005), new Carro("Preto", 1985));
        //Reference to a static method
        Collections.sort(carros, ComparadorCarro::comparePorCor);
        System.out.println(carros);
        //Reference to an instance method of a particular object
        ComparadorCarro comparadorCarro = new ComparadorCarro();
        Supplier<ComparadorCarro> comparadorCarroSupplier = ComparadorCarro::new;
        Collections.sort(carros, comparadorCarroSupplier.get()::comparePorAno);
        System.out.println(carros);
        //Reference to an instance method of an arbitrary object of a particular type
        List<String> nomes = asList("William", "DevDojo", "Anna", "Brenon");
        nomes.sort((s1, s2) -> s1.compareTo(s2));
        nomes.sort(String::compareTo);
        System.out.println(nomes);
        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringToInteger2 = Integer::parseInt;
        BiPredicate<List<String>, String> contains = (lista, elemento) -> lista.contains(elemento);
        BiPredicate<List<String>, String> contains2 = List::contains;
        System.out.println(stringToInteger2.apply("10"));
        System.out.println(contains2.test(nomes,"William"));
        //Reference to a constructor
        BiFunction<String, Integer, Carro> carroBiFunction = (s,i) -> new Carro(s,i);
        BiFunction<String, Integer, Carro> carroBiFunction2 = Carro::new;
        System.out.println(carroBiFunction.apply("rosa", 1994));
        System.out.println(carroBiFunction2.apply("rosa", 1994));



    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T e : list) {
            c.accept(e);
        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            result.add(f.apply(e));
        }
        return result;
    }
}
