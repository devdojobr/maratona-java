package br.com.abc.javacore.ZZIdefault.interfaces;

/**
 * Created by William Suane on 12/5/2016.
 */
public interface B{
    default void oi(){
        System.out.println("Dentro do oi de B");
    }
}
