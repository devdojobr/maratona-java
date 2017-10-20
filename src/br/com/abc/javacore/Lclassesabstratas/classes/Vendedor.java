package br.com.abc.javacore.Lclassesabstratas.classes;

/**
 * Created by William Suane on 5/25/2016.
 */
public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }


    @Override
    public void calculaSalario() {
        this.salario = salario + (totalVendas * 0.05);
    }

    @Override
    public void imprime() {
        System.out.println("dentro do metodo imprime");
    }
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

}
