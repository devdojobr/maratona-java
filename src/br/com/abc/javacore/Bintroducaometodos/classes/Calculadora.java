package br.com.abc.javacore.Bintroducaometodos.classes;

/**
 * Created by William Suane on 3/17/2016.
 */
public class Calculadora {

    public static void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public static void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public static void multiplicaDoisNumeros(double num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static double divideDoisNumeros(double num1, double num2) {

        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public static void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não é possivel dividir por 0");
    }

    public static void alteraDoisNumeros(int a, int b){
        a = 30;
        b = 40;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("num1: "+a);
        System.out.println("num2: "+b);
    }

    public static void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public static void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

}
