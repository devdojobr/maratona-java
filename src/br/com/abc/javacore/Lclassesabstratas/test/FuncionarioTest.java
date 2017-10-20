package br.com.abc.javacore.Lclassesabstratas.test;

import br.com.abc.javacore.Lclassesabstratas.classes.Funcionario;
import br.com.abc.javacore.Lclassesabstratas.classes.Gerente;
import br.com.abc.javacore.Lclassesabstratas.classes.Vendedor;

/**
 * Created by William Suane on 5/25/2016.
 */
public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Anna", "11122-2", 2000);
        Vendedor v = new Vendedor("Camila", "22211-4",1500,5000);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(g);
        System.out.println("--------------");
        System.out.println(v);
    }
}
