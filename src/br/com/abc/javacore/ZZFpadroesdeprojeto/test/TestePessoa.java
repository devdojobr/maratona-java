package br.com.abc.javacore.ZZFpadroesdeprojeto.test;

import br.com.abc.javacore.ZZFpadroesdeprojeto.classes.Pessoa;

/**
 * Created by William Suane on 11/11/2016.
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("William")
                .nomeDoMeio("Suane")
                .ultimoNome("Queiroz")
                .nomeDoPai("William")
                .apelido("JirayaBolado")
                .build();
        System.out.println(p);
    }
}
