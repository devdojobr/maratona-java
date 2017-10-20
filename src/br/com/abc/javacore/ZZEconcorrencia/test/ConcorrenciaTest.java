package br.com.abc.javacore.ZZEconcorrencia.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by William Suane on 10/24/2016.
 */
class Contador {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();
    private Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
            atomicInteger.getAndIncrement();
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }

    public int getAtomicInteger() {
        return atomicInteger.intValue();
    }
}

class IncrementadorThread extends Thread {
    private Contador contador;

    public IncrementadorThread(Contador contador) {
        this.contador = contador;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            contador.increment();
        }
    }
}

public class ConcorrenciaTest {
    public static void main(String[] args) throws InterruptedException {
        Contador c = new Contador();
        IncrementadorThread it1 = new IncrementadorThread(c);
        IncrementadorThread it2 = new IncrementadorThread(c);
        it1.start();
        it2.start();
        it1.join();
        it2.join();
        System.out.println(c.getCount());
        System.out.println(c.getAtomicInteger());
    }
}
