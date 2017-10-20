package br.com.abc.javacore.Npolimorfismo.classes;

/**
 * Created by William Suane on 6/2/2016.
 */
public class DatabaseDAOImpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados");
    }
}
