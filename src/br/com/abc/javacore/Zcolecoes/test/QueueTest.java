package br.com.abc.javacore.Zcolecoes.test;

import br.com.abc.javacore.Zcolecoes.classes.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by William Suane on 9/12/2016.
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("D");
        queue.add("A");
        queue.add("B");
        System.out.println(queue.remove("B"));
        System.out.println(queue.size());
    }
}
