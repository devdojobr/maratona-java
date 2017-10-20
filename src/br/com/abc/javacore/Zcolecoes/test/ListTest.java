package br.com.abc.javacore.Zcolecoes.test;

import br.com.abc.javacore.Yserializacao.classes.Pessoa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by William Suane on 8/30/2016.
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("William");
        nomes.add("DevDojo");
        nomes2.add("William2");
        nomes2.add("DevDojo2");
//        System.out.println("size: "+ nomes.size());
//        System.out.println(nomes.remove("DevDojo"));
//        System.out.println("size: "+ nomes.size());
        nomes.clear();
        nomes.addAll(nomes2);
        int size = nomes.size();
        for(int i=0; i< size ; i++){
            System.out.println(nomes.get(i));
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        for(Integer num : numeros){
            System.out.println(num);
        }
    }
}
