package br.com.abc.javacore.ZZCjdbc.test;

import br.com.abc.javacore.ZZCjdbc.classes.Carro;
import br.com.abc.javacore.ZZCjdbc.classes.Comprador;
import br.com.abc.javacore.ZZCjdbc.db.CarroDAOImpl;
import br.com.abc.javacore.ZZCjdbc.db.CarroDAOImplNoSQL;
import br.com.abc.javacore.ZZCjdbc.interfaces.CarroDAO;

import java.util.List;
import java.util.Scanner;

/**
 * Created by William Suane on 9/30/2016.
 */
public class CarroCRUD {
    private static Scanner teclado = new Scanner(System.in);
    private static CarroDAO dao = new CarroDAOImplNoSQL();

    public static void executar(int op) {
        switch (op) {
            case 1:
                inserir();
                break;
            case 2:
                atualizar();
                break;
            case 3:
                listar();
                break;
            case 4:
                System.out.println("Digite o nome");
                buscarPorNome(teclado.nextLine());
                break;
            case 5:
                deletar();
                break;
        }
    }

    private static void inserir() {
        Carro c = new Carro();
        System.out.println("Nome: ");
        c.setNome(teclado.nextLine());
        System.out.println("Placa: ");
        c.setPlaca(teclado.nextLine());
        System.out.println("Selecione um dos compradores abaixo");
        List<Comprador> compradorList = CompradorCRUD.listar();
        c.setComprador(compradorList.get(Integer.parseInt(teclado.nextLine())));
        dao.save(c);
    }

    private static void atualizar() {
        System.out.println("Selecione um dos carros abaixo");
        List<Carro> carroList = listar();
        Carro c = carroList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Novo nome ou enter para manter o mesmo");
        String nome = teclado.nextLine();
        System.out.println("Nova placa ou enter para manter o mesma");
        String placa = teclado.nextLine();
        if (!nome.isEmpty()) {
            c.setNome(nome);
        }
        if (!placa.isEmpty()) {
            c.setPlaca(placa);
        }
        dao.update(c);
    }

    private static List<Carro> listar() {
        List<Carro> carroList = dao.selectAll();
        for (int i = 0; i < carroList.size(); i++) {
            Carro c = carroList.get(i);
            System.out.println("[" + i + "] " + c.getNome() + " " + c.getPlaca() + " "+c.getComprador().getNome());
        }
        return carroList;
    }

    private static void buscarPorNome(String nome) {
        List<Carro> carroList = dao.searchByName(nome);
        for (int i = 0; i < carroList.size(); i++) {
            Carro c = carroList.get(i);
            System.out.println("[" + i + "] " + c.getNome() + " " + c.getPlaca() + " "+c.getComprador().getNome());
        }
    }

    public static void deletar() {
        System.out.println("Selecione um dos carros abaixo para deletar");
        List<Carro> carroList = listar();
        int index = Integer.parseInt(teclado.nextLine());
        System.out.println("Tem certeza? S/N");
        String op = teclado.nextLine();
        if (op.startsWith("s")) {
            dao.delete(carroList.get(index));
        }
    }
}
