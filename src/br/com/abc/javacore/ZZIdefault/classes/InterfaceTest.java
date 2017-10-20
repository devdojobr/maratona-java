package br.com.abc.javacore.ZZIdefault.classes;

import br.com.abc.javacore.ZZIdefault.interfaces.MyList;

import java.util.Collections;
import java.util.List;

/**
 * Created by William Suane on 12/5/2016.
 */
public class InterfaceTest implements MyList {
    public static void main(String[] args) {
        MyList.sort();
        new InterfaceTest().remove();
    }


    @Override
    public void add() {
        System.out.println("dentro do add");
    }

}
