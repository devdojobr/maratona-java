package br.com.abc.javacore.ZZAGenerics.test;

import br.com.abc.javacore.ZZAGenerics.classes.Carro;
import br.com.abc.javacore.ZZAGenerics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by William Suane on 9/13/2016.
 */
public class ClasseGenericaTeste {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getObjetoDisponivel();
        System.out.println("Usando o carro por um mes");
        carroAlugavel.devolverObjeto(carro);
        System.out.println("---------");

        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("Alienware"));
        computadoresDisponiveis.add(new Computador("HP"));
        ObjetosAlugaveis<Computador> computadorAlugavel = new ObjetosAlugaveis<>(computadoresDisponiveis);
        Computador c = computadorAlugavel.getObjetoDisponivel();
        System.out.println("Usando computador");
        computadorAlugavel.devolverObjeto(c);
    }
}

//Type
class ObjetosAlugaveis<T> {
    private List<T> objetosDiponiveis;
    public ObjetosAlugaveis(List<T> objetosDiponiveis) {
        this.objetosDiponiveis = objetosDiponiveis;
    }
    //Alugar
    public T getObjetoDisponivel() {
        T t = objetosDiponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponiveis: " + objetosDiponiveis);
        return t;
    }

    public void devolverObjeto(T t) {
        System.out.println("Devolvendo objeto: " + t);
        objetosDiponiveis.add(t);
        System.out.println("Objetos disponiveis: " + objetosDiponiveis);
    }
}

class DoisAtributs<T,X>{
    T um;
    X dois;

    public DoisAtributs(T um, X dois) {
        this.um = um;
        this.dois = dois;
    }

    public T getUm() {
        return um;
    }

    public void setUm(T um) {
        this.um = um;
    }

    public X getDois() {
        return dois;
    }

    public void setDois(X dois) {
        this.dois = dois;
    }
}
