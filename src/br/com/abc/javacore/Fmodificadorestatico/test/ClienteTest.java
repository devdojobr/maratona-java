package br.com.abc.javacore.Fmodificadorestatico.test;


import br.com.abc.javacore.Fmodificadorestatico.classes.Cliente;

/**
 * Created by William Suane on 4/14/2016.
 */
public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
//        for(int parcela : c.getParcelas()){
//            System.out.print(parcela + " ");
//        }
        System.out.println("tamanho: "+ Cliente.getParcelas().length);

    }
}
