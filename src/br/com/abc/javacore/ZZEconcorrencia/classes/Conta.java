package br.com.abc.javacore.ZZEconcorrencia.classes;

/**
 * Created by William Suane on 10/19/2016.
 */
public class Conta {
    private int saldo = 50;

    public int getSaldo() {
        return saldo;
    }

    public void saque(int valor) {
        saldo = saldo - valor;
    }
}
