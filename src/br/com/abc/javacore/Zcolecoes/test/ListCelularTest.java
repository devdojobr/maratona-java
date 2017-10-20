package br.com.abc.javacore.Zcolecoes.test;

import br.com.abc.javacore.Zcolecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by William Suane on 9/6/2016.
 */
public class ListCelularTest {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S7", "123456");
        Celular celular2 = new Celular("iPhone 6S", "981821");
        Celular celular3 = new Celular("Sony Xperia", "019212");
        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for(Celular celular : celularList){
            System.out.println(celular);
        }
        Celular celular4 = new Celular("Galaxy S7", "123456");
        System.out.println(celularList.contains(celular4));

    }
}
