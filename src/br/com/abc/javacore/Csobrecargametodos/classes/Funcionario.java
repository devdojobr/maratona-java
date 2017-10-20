package br.com.abc.javacore.Csobrecargametodos.classes;

/**
 * Created by William Suane on 4/6/2016.
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public Funcionario(String nome, String cpf, double salario, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }
    public Funcionario(){

    }

    public void init(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public void init(String nome, String cpf, double salario,String rg){
        init(nome,cpf,salario);
        this.rg = rg;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg){
        this.rg = rg;
    }
    public String getRg(){
        return this.rg;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

}
