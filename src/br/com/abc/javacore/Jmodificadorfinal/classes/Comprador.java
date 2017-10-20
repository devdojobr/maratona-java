package br.com.abc.javacore.Jmodificadorfinal.classes;

/**
 * Created by William Suane on 5/11/2016.
 */
public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Comprador{" +
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
