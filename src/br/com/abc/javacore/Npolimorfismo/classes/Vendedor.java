package br.com.abc.javacore.Npolimorfismo.classes;

/**
 * Created by William Suane on 6/1/2016.
 */
public class Vendedor extends Funcionario{
    private double totalVendas;

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public void calcularPagamento() {
        this.salario  = this.salario + (totalVendas * 0.05);
    }
}
