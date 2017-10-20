package br.com.abc.javacore.ZZEconcorrencia.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by William Suane on 10/28/2016.
 */
class MapReadWrite {
    private Map<String, String> map = new LinkedHashMap<>();

    public void put(String key, String value) {
        map.put(key, value);
    }

    public Object[] allKeys() {
        return map.keySet().toArray();
    }
}


public class MapReadWriteLockTest {
    private final static MapReadWrite mapReadWrite = new MapReadWrite();
    private static final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Write());
        Thread t2 = new Thread(new ReadA());
        Thread t3 = new Thread(new ReadB());
        t1.start();
        t2.start();
        t3.start();
    }

    static class Write implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                rwl.writeLock().lock();
                try {
                    mapReadWrite.put(String.valueOf(i), String.valueOf(i));
                } finally {
                    rwl.writeLock().unlock();
                }
            }
        }
    }

    static class ReadA implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                rwl.readLock().lock();
                try{
                    System.out.println(Thread.currentThread().getName() +" "+ Arrays.toString(mapReadWrite.allKeys()));
                }finally {
                    rwl.readLock().unlock();
                }
            }
        }
    }
    static class ReadB implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                rwl.readLock().lock();
                try{
                    System.out.println(Thread.currentThread().getName() +" "+ Arrays.toString(mapReadWrite.allKeys()));
                }finally {
                    rwl.readLock().unlock();
                }
            }
        }
    }
}
