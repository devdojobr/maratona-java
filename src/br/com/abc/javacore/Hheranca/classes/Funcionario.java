package br.com.abc.javacore.Hheranca.classes;

/**
 * Created by William Suane on 5/4/2016.
 */
public class Funcionario extends Pessoa {

    private double salario;

    {
        System.out.println("Bloco de inicializacao de funcionario 1");
    }

    {
        System.out.println("Bloco de inicializacao de funcionario 2");
    }

    static {
        System.out.println("Bloco de inicializacao static de funcionario 1");
    }


    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
