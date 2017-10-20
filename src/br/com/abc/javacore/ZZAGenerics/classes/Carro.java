package br.com.abc.javacore.ZZAGenerics.classes;

/**
 * Created by William Suane on 9/13/2016.
 */
public class Carro{
    private String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
