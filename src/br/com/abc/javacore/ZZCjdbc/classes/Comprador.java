package br.com.abc.javacore.ZZCjdbc.classes;

/**
 * Created by William Suane on 9/19/2016.
 */
public class Comprador {
    private Integer id;
    private String cpf;
    private String nome;

    public Comprador() {
    }

    public Comprador(Integer id, String cpf, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Comprador(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comprador comprador = (Comprador) o;

        return id != null ? id.equals(comprador.id) : comprador.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
