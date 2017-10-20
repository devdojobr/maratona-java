package br.com.abc.javacore.Isobrescrita.test;

import br.com.abc.javacore.Isobrescrita.classes.Pessoa;

/**
 * Created by William Suane on 5/11/2016.
 */
public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina na esquina");
        p.setIdade(300);
        System.out.println(p);
        Pessoa p2 = new Pessoa();
        p2.setNome("Joao na esquina");
        p2.setIdade(200);
        System.out.println(p2);
    }
}
