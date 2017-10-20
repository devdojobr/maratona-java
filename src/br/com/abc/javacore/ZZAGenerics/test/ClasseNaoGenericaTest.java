package br.com.abc.javacore.ZZAGenerics.test;

import br.com.abc.javacore.ZZAGenerics.classes.Carro;
import br.com.abc.javacore.ZZAGenerics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by William Suane on 9/13/2016.
 */
public class ClasseNaoGenericaTest {
    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por um mes");
        carroAlugavel.devolverCarro(carroAlugado);

        System.out.println(" -----------------------  ");
        ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
        Computador computador = computadorAlugavel.getComputadorDisponivel();
        System.out.println("Usando o PC");
        computadorAlugavel.devolverComputador(computador);
    }
}

class CarroAlugavel {
    private List<Carro> carrosDisponiveis = new ArrayList<>();
    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
    }
    //Alugar
    public Carro getCarroDisponivel(){
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+c);
        System.out.println("Carros disponiveis: "+carrosDisponiveis);
        return c;
    }
    public void devolverCarro(Carro c){
        System.out.println("Devolvendo carro: "+c);
        carrosDisponiveis.add(c);
        System.out.println("Carros disponiveis: "+carrosDisponiveis);
    }
}

class ComputadorAlugavel {
    private List<Computador> computadoresDisponiveis = new ArrayList<>();
    {
        computadoresDisponiveis.add(new Computador("Alienware"));
        computadoresDisponiveis.add(new Computador("HP"));
    }
    //Alugar
    public Computador getComputadorDisponivel(){
        Computador c = computadoresDisponiveis.remove(0);
        System.out.println("Alugando pc: "+c);
        System.out.println("PC disponiveis: "+ computadoresDisponiveis);
        return c;
    }
    public void devolverComputador(Computador c){
        System.out.println("Devolvendo PC: "+c);
        computadoresDisponiveis.add(c);
        System.out.println("PC disponiveis: "+ computadoresDisponiveis);
    }
}
