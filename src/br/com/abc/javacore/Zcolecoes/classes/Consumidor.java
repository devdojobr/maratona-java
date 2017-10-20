package br.com.abc.javacore.Zcolecoes.classes;

/**
 * Created by William Suane on 9/8/2016.
 */
public class Consumidor {
    private String nome;
    private String cpf;

    public Consumidor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cosumidor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Consumidor consumidor = (Consumidor) o;

        return cpf != null ? cpf.equals(consumidor.cpf) : consumidor.cpf == null;

    }

    @Override
    public int hashCode() {
        return cpf != null ? cpf.hashCode() : 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
