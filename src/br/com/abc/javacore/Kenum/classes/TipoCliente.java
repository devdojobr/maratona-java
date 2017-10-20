package br.com.abc.javacore.Kenum.classes;

/**
 * Created by William Suane on 5/12/2016.
 */
public enum TipoCliente {
    // constant specific class body
    // corpo de classe especifico constante
    PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica"){
        public String getId(){
            return "B";
        }
    };

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getId(){
        return "A";
    }
    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
