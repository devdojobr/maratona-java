package br.com.abc.javacore.ZZDthreads.test;

import br.com.abc.javacore.ZZDthreads.classes.Conta;

/**
 * Created by William Suane on 10/19/2016.
 */
public class ContaTest implements Runnable {
    private Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest();
        Thread william = new Thread(contaTest, "William");
        Thread anna = new Thread(contaTest, "Anna");
        william.start();
        anna.start();
    }

    public static void imprime() {
        synchronized (ContaTest.class){
            System.out.println("asasaas");
        }
    }

    private void saque(int valor) {
        synchronized (conta) {
            if (conta.getSaldo() >= valor) {
                System.out.println(Thread.currentThread().getName() + " está indo sacar");
                conta.saque(valor);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo());
            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, saldo: " + conta.getSaldo());
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo() < 0) {
                System.out.println("Oh meu deus!");
            }
        }
    }
}
