package br.com.abc.javacore.Oexception.error.test;

/**
 * Created by William Suane on 6/8/2016.
 */
public class ErrorTest {
    public static void main(String[] args) {
        stackOverflowError();
    }

    public static void stackOverflowError(){
        stackOverflowError();
    }
}
