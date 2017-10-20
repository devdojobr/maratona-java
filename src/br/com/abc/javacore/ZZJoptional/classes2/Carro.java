package br.com.abc.javacore.ZZJoptional.classes2;

import br.com.abc.javacore.ZZJoptional.classes2.*;

/**
 * Created by William Suane on 12/7/2016.
 */
public class Carro {
    private Seguradora seguradora;
    private String nome;

    public String getNomeSeguradora(Pessoa p) {
        if (p != null) {
            Carro carro = p.getCarro();
            if (carro != null) {
                Seguradora s = carro.getSeguradora();
                if (s != null) {
                    return s.getNome();
                }
            }
        }
        return "";
    }

    public Seguradora getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(Seguradora seguradora) {
        this.seguradora = seguradora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
