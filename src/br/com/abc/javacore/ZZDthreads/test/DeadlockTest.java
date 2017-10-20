package br.com.abc.javacore.ZZDthreads.test;

/**
 * Created by William Suane on 10/19/2016.
 */
public class DeadlockTest {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        new ThreadExemplo1().start();
        new ThreadExemplo2().start();
    }
    private static class ThreadExemplo1 extends Thread{
        public void run(){
            synchronized (lock1){
                System.out.println("Thread 1: Segurando lock 1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Esperando pelo lock 2");
                synchronized (lock2){
                    System.out.println("Thread 1: segurando lock 1 e lock 2");
                }
            }
        }
    }
    private static class ThreadExemplo2 extends Thread{
        public void run(){
            synchronized (lock1){
                System.out.println("Thread 2: Segurando lock 1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Esperando pelo lock 2");
                synchronized (lock2){
                    System.out.println("Thread 2: segurando lock 2 e lock 1");
                }
            }
        }
    }
}
