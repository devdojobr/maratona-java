package br.com.abc.javacore.Npolimorfismo.test;

import br.com.abc.javacore.Npolimorfismo.classes.ArquivoDAOImpl;
import br.com.abc.javacore.Npolimorfismo.classes.DatabaseDAOImpl;
import br.com.abc.javacore.Npolimorfismo.classes.GenericDAO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by William Suane on 6/2/2016.
 */
public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
        List<String> lista = new LinkedList<>();
        lista.add("nome1");
        lista.add("nome2");
        lista.add("nome3");
        lista.add("nome4");
        for(String nome : lista ){
            System.out.println(nome);
        }
    }
}
