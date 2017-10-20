package br.com.abc.javacore.Isobrescrita.classes;

/**
 * Created by William Suane on 5/11/2016.
 */
public class Pessoa{
    private String nome;
    private int idade;


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
