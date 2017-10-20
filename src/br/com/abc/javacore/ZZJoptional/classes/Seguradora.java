package br.com.abc.javacore.ZZJoptional.classes;

import java.util.Optional;

/**
 * Created by William Suane on 12/7/2016.
 */
public class Seguradora {
    private String nome;

    public Seguradora(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Seguradora{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Seguradora() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
