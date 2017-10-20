package br.com.abc.javacore.Bintroducaometodos.classes;

/**
 * Created by William Suane on 3/10/2016.
 */
// Crie os seguintes atributos para essa classe
    //Nome
    //Matricula
    //rg
    //cpf
// Crie uma classe de teste para preencher e imprimir os dados desse professor
public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;


    public void imprime(){
        System.out.println("----------------------");
        System.out.println(this.cpf);
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.rg);
    }

}
