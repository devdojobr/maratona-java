package br.com.abc.javacore.ZZIdefault.interfaces;

/**
 * Created by William Suane on 12/5/2016.
 */
public interface MyList {
    static void sort(){
        System.out.println("dentro do sort");
    }
    void add();

    default void remove(){
        System.out.println("dentro do remove");
    }

}
