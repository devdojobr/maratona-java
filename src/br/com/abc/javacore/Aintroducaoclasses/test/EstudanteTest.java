package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Estudante;

/**
 * Created by William Suane on 3/9/2016.
 */
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome = "Joao";
        joao.matricula = "1212";
        joao.idade = 15;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);
    }
}
