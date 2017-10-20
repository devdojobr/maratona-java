package br.com.abc.javacore.Npolimorfismo.classes;

/**
 * Created by William Suane on 6/1/2016.
 */
public class Gerente extends Funcionario {
    private double pnl;

    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + pnl;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
}
