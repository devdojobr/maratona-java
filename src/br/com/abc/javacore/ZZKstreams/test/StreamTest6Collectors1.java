package br.com.abc.javacore.ZZKstreams.test;

import br.com.abc.javacore.ZZKstreams.classes.Pessoa;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

/**
 * Created by William Suane on 1/3/2017.
 */
public class StreamTest6Collectors1 {
    // Redução e sumarização de streams em um valor único
    // Agrupamento de elementos
    // Particionamento de elementos
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        System.out.println(pessoas.stream().count());
        System.out.println(pessoas.stream().collect(counting()));

        Optional<Pessoa> max = pessoas.stream().max(comparing(Pessoa::getSalario));
        System.out.println(max.get().getSalario());

        Optional<Pessoa> collect = pessoas.stream().collect(maxBy(comparing(Pessoa::getSalario)));
        System.out.println(collect.get().getSalario());
        Optional<Pessoa> collect1 = pessoas.stream().collect(minBy(comparing(Pessoa::getSalario)));
        System.out.println(collect1.get().getSalario());

        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).sum());
        System.out.println(pessoas.stream().collect(summingDouble(Pessoa::getSalario)));

        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).average());
        System.out.println(pessoas.stream().collect(averagingDouble(Pessoa::getSalario)));

        DoubleSummaryStatistics collect2 = pessoas.stream().collect(summarizingDouble(Pessoa::getSalario));
        System.out.println(collect2);

        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining()));
        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining(", ")));


    }
}
