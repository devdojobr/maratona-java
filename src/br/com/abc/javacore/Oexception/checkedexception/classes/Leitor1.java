package br.com.abc.javacore.Oexception.checkedexception.classes;

/**
 * Created by William Suane on 6/22/2016.
 */
public class Leitor1 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 1");
    }
}
