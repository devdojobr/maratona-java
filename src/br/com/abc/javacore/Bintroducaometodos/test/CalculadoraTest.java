package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;

/**
 * Created by William Suane on 3/17/2016.
 */
public class CalculadoraTest {
    public static void main(String args[]) {

        Calculadora.somaDoisNumeros();
        Calculadora.subtraiDoisNumeros();
        Calculadora.multiplicaDoisNumeros(55.5,5);
        System.out.println("divisao de dois numeros");
        double result = Calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println("imprimindo dois numeros divididos");
        Calculadora.imprimeDoisNumerosDivididos(20,0);
        System.out.println("Continuando a exec");

        int[] numeros = {1,2,3,4,5};
        Calculadora.somaArray(numeros);
        Calculadora.somaVarArgs(1,2,3,4,5);
    }
}
