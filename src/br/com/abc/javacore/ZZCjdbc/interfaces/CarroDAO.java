package br.com.abc.javacore.ZZCjdbc.interfaces;

import br.com.abc.javacore.ZZCjdbc.classes.Carro;

import java.util.List;

/**
 * Created by William Suane on 11/16/2016.
 */
public interface CarroDAO {
    void update(Carro carro);

    void save(Carro carro);

    void delete(Carro carro);

    List<Carro> selectAll();

    List<Carro> searchByName(String nome);
}
