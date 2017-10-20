package br.com.abc.javacore.Aintroducaoclasses.test;


import br.com.abc.javacore.Aintroducaoclasses.classes.Carro;

/**
 * Created by William Suane on 3/10/2016.
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.placa = "QWJ1029";
        carro.velocidadeMaxima = 120f;
        System.out.println(carro.placa);
        System.out.println(carro.modelo);
        System.out.println(carro.velocidadeMaxima);
    }
}
