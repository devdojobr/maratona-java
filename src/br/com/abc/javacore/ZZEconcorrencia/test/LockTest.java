package br.com.abc.javacore.ZZEconcorrencia.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by William Suane on 10/25/2016.
 */
public class LockTest {
    public static void main(String[] args) {
        final ReentrantLock lock = new ReentrantLock();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
        new Thread(new Worker("E", lock)).start();
        new Thread(new Worker("F", lock)).start();
        new Thread(new Worker("G", lock)).start();
    }
    static class Worker implements Runnable{
        private String nome;
        private ReentrantLock reentrantLock;

        public Worker(String nome, ReentrantLock reentrantLock) {
            this.nome = nome;
            this.reentrantLock = reentrantLock;
        }

        @Override
        public void run() {
            reentrantLock.lock();
            try {
                if(reentrantLock.isHeldByCurrentThread())
                    System.out.printf("Thread %s entrou em uma sessão crítica%n", nome);
                System.out.printf("%d Threads esperando na fila%n", reentrantLock.getQueueLength());
                System.out.printf("Thread %s vai trabalhar por 2 segundos%n", nome);
                Thread.sleep(2000);
                System.out.printf("Thread %s finalizou o trabalho%n", nome);

            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
        }
    }
}
