package br.com.abc.introducao.controlefluxo;

/**
 * Created by William Suane on 2/17/2016.
 */
public class ControleFluxo1 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 juvenil
        // idade >=18 adulto
        int idade = 14;
        String categoria;
        if(idade < 15) {
            categoria = "infantil";
        }else if(idade>=15 && idade < 18){
            categoria = "juvenil";
        }else{
            categoria = "adulto";
        }
        System.out.println(categoria);

    }
}
