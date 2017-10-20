package br.com.abc.javacore.Lclassesabstratas.classes;

/**
 * Created by William Suane on 5/25/2016.
 */
public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (salario * 0.2);
    }
}
