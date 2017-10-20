package br.com.abc.javacore.ZZEconcorrencia.test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/**
 * Created by William Suane on 11/2/2016.
 */

public class CopyOnWriteTest implements Runnable {
    private List<Integer> list = new CopyOnWriteArrayList<>();
    public CopyOnWriteTest() {
        for (int i = 0; i < 9000; i++) {
            list.add(i);
        }
    }

    @Override
    public void run() {
        Iterator<Integer> iterator = list.iterator();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(iterator.hasNext()){
            System.out.println(Thread.currentThread().getName() +" "+iterator.next());
            iterator.remove();
        }
    }

    public List<Integer> getList() {
        return list;
    }

    public static void main(String[] args) {
        CopyOnWriteTest ct = new CopyOnWriteTest();
        Thread t1 = new Thread(ct);
        Thread t2 = new Thread(ct);
//        Thread removedor = new Thread(new RemoverMembros(ct.getList()));
        t1.start();
        t2.start();
//        removedor.start();

    }
    private static class RemoverMembros implements Runnable{
        private List<Integer> list;

        public RemoverMembros(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            for (int i = 0; i < 500; i++) {
                System.out.println(Thread.currentThread().getName() +" removeu: "+list.remove(i));
            }
        }
    }

}
