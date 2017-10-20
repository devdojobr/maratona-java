package br.com.abc.javacore.ZZAGenerics.classes;

/**
 * Created by William Suane on 9/13/2016.
 */
public class Computador {
    private String nome;

    public Computador(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Computador{" +
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
