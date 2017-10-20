package br.com.abc.javacore.ZZLstreamsparalelos;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by William Suane on 1/17/2017.
 */
public class StreamsParalelos1 {
    public static void main(String[] args) {
        long num = 10_000_000_000L;
        somaFor(num);
//        somaStreamIterate(num);
//        somaParallelStreamIterate(num);
        somaRangeClosedStream(num);
        somaRangeClosedParallelStream(num);
        System.out.println(Runtime.getRuntime().availableProcessors());
//        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","12");
    }
    //[1,2,3,4,5,6,7,8,9,10]

    private static void somaFor(long num) {
        System.out.println("For");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1L; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void somaStreamIterate(long num) {
        System.out.println("Stream Sequencial");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void somaParallelStreamIterate(long num) {
        System.out.println("Stream Paralelos");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void somaRangeClosedStream(long num) {
        System.out.println("Range Closed  Stream");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    //[1,2,3,4,5,6,7,8,9,10]
    //[1-5][6-10]
    private static void somaRangeClosedParallelStream(long num) {
        System.out.println("Range Closed Parallel Stream");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }


}
