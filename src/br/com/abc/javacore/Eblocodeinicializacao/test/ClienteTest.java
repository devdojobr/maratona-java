package br.com.abc.javacore.Eblocodeinicializacao.test;

import br.com.abc.javacore.Eblocodeinicializacao.classes.Cliente;

/**
 * Created by William Suane on 4/14/2016.
 */
public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        for(int parcela : c.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}
