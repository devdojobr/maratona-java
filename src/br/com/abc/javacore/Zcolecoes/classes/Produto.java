package br.com.abc.javacore.Zcolecoes.classes;

/**
 * Created by William Suane on 9/6/2016.
 */
public class Produto implements Comparable<Produto>{

    private String serialNumber;
    private String nome;
    private Double preco;
    private int quantidade;

    public Produto(String serialNumber, String nome, double preco) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String serialNumber, String nome, Double preco, int quantidade) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto produto = (Produto) o;

        return serialNumber != null ? serialNumber.equals(produto.serialNumber) : produto.serialNumber == null;

    }

    @Override
    public int hashCode() {
        return serialNumber != null ? serialNumber.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serialNumber='" + serialNumber + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outroObjeto) {

        return this.preco.compareTo(outroObjeto.getPreco());
    }
}
