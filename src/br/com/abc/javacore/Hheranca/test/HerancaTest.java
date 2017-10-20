package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

/**
 * Created by William Suane on 5/4/2016.
 */
public class HerancaTest {
    public static void main(String[] args) {
//        Pessoa p = new Pessoa("Gina");
        Endereco end = new Endereco();
//        p.setCpf("12345");
//        end.setBairro("Bairro 1");
        end.setRua("Rua 25");
//        p.setEndereco(end);
//        p.imprime();
        System.out.println("-------------------------------");
        Funcionario f = new Funcionario("Augusto");
        f.setCpf("98765");
        f.setSalario(15000);
        f.setEndereco(end);
//        f.imprime();


    }
}
