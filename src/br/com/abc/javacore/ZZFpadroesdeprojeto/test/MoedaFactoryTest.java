package br.com.abc.javacore.ZZFpadroesdeprojeto.test;

import br.com.abc.javacore.ZZFpadroesdeprojeto.classes.Moeda;
import br.com.abc.javacore.ZZFpadroesdeprojeto.classes.MoedaFactory;
import br.com.abc.javacore.ZZFpadroesdeprojeto.classes.Pais;

/**
 * Created by William Suane on 11/17/2016.
 */
public class MoedaFactoryTest {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.EUA);
        System.out.println(moeda.getSimbolo());
    }
}
