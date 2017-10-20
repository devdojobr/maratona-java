package br.com.abc.javacore.ZZFpadroesdeprojeto.test;

import br.com.abc.javacore.ZZFpadroesdeprojeto.classes.AviaoSingletonEnum;

/**
 * Created by William Suane on 11/11/2016.
 */
public class AviaoSingletonEnumTest {
    public static void main(String[] args) {
        AviaoSingletonEnum.agendarAssento("1A");
        AviaoSingletonEnum.agendarAssento("1A");
    }
}
