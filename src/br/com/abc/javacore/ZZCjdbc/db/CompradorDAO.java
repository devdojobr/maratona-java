package br.com.abc.javacore.ZZCjdbc.db;

import br.com.abc.javacore.ZZCjdbc.classes.Comprador;
import br.com.abc.javacore.ZZCjdbc.conn.ConexaoFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by William Suane on 9/27/2016.
 */
public class CompradorDAO {
    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ( ?, ?)";

        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.executeUpdate();
            System.out.println("Registro inserido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel excluir o registro");
            return;
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE `id`= ?";
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, comprador.getId());
            ps.executeUpdate();
            System.out.println("Registro excluido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf`= ? , `nome`= ? WHERE `id`=?";
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, comprador.getCpf());
            ps.setString(2, comprador.getNome());
            ps.setInt(3, comprador.getId());
            ps.executeUpdate();
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Comprador> selectAll() {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador";
        List<Comprador> compradorList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByName(String nome) {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador where nome like ?";
        List<Comprador> compradorList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }
            ConexaoFactory.close(conn, ps, rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Comprador searchById(Integer id) {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador where id=?";
        Comprador comprador = null;
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                comprador = new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome"));
            }
            ConexaoFactory.close(conn, ps, rs);
            return comprador;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
