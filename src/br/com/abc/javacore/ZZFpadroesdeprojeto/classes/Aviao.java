package br.com.abc.javacore.ZZFpadroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by William Suane on 11/11/2016.
 */
public class Aviao {
    private Set<String> assentosDisponiveis;

    public Aviao() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }

    public boolean bookAssento(String assento) {
        return assentosDisponiveis.remove(assento);
    }
}
