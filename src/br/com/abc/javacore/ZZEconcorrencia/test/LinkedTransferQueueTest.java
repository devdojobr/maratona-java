package br.com.abc.javacore.ZZEconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

/**
 * Created by William Suane on 11/3/2016.
 */
public class LinkedTransferQueueTest {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("William"));
        tq.put("DevDojo");
        System.out.println(tq.offer("William"));
        System.out.println(tq.offer("William",1, TimeUnit.NANOSECONDS));
//        tq.transfer("DevDojo");
        System.out.println(tq.tryTransfer("DevDojo"));
        System.out.println(tq.tryTransfer("DevDojo",1, TimeUnit.SECONDS));

        System.out.println(tq.remainingCapacity());
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.poll(10, TimeUnit.MILLISECONDS));
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
