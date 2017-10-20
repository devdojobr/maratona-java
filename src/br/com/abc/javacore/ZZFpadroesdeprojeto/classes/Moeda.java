package br.com.abc.javacore.ZZFpadroesdeprojeto.classes;

/**
 * Created by William Suane on 11/17/2016.
 */
public interface Moeda {
    String getSimbolo();
}

class Real implements Moeda {
    @Override
    public String getSimbolo() {
        return "R$";
    }
}

class USDolar implements Moeda{
    @Override
    public String getSimbolo() {
        return "USD";
    }
}

