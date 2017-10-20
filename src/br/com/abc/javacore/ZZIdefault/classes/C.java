package br.com.abc.javacore.ZZIdefault.classes;

import br.com.abc.javacore.ZZIdefault.interfaces.A;
import br.com.abc.javacore.ZZIdefault.interfaces.B;
import br.com.abc.javacore.ZZIdefault.interfaces.D;

/**
 * Created by William Suane on 12/5/2016.
 */
public class C implements A, B {
    public static void main(String[] args) {
        new C().oi();
    }
    public void oi(){
        B.super.oi();
    }
}
