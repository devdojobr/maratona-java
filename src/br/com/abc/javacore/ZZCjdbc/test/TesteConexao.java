package br.com.abc.javacore.ZZCjdbc.test;

import br.com.abc.javacore.ZZCjdbc.classes.Comprador;
import br.com.abc.javacore.ZZCjdbc.db.CompradorDBOLD;

import java.util.List;

/**
 * Created by William Suane on 9/19/2016.
 */
public class TesteConexao {
    public static void main(String[] args) {
//        deletar();
//        atualizar();
//        List<Comprador> listaComprador = selecionarTudo();
//        List<Comprador> listaComprador2 = buscarPorNome("oao");
//        System.out.println(listaComprador);
//        System.out.println(listaComprador2);
//        CompradorDB.selectMetaData();
//        CompradorDB.checkDriverStatus();
//        CompradorDB.testTypeScroll();
//        CompradorDB.updateNomesToLowerCase();
//        System.out.println(CompradorDB.searchByNamePreparedStatement("oao"));
//        CompradorDB.updatePreparedStatement(new Comprador(1,"011.011.011-01", "Prepared Statement da Silva"));
//        System.out.println(CompradorDB.searchByNameCallableStatement("%oao%"));
//        System.out.println(CompradorDB.searchByNameRowSet("oao"));
//        CompradorDB.updateRowSet(new Comprador(1,"011.011.011-01", "Prepared Statement da Silva"));
        CompradorDBOLD.updateRowSetCached(new Comprador(1,"011.011.011-01", "Prepared Statement da Silva"));

    }


    public static void inserir() {
        Comprador comprador = new Comprador("111.111.111-22", "Priscila");
        CompradorDBOLD.save(comprador);
    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(2);
        CompradorDBOLD.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(1, "MARIA", "000.000.000-11");
        CompradorDBOLD.update(comprador);
    }

    public static List<Comprador> selecionarTudo() {
        return CompradorDBOLD.selectAll();
    }

    public static List<Comprador> buscarPorNome(String nome) {
        return CompradorDBOLD.searchByName(nome);
    }
}
