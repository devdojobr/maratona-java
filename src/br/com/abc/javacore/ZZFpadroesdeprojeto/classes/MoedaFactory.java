package br.com.abc.javacore.ZZFpadroesdeprojeto.classes;

/**
 * Created by William Suane on 11/17/2016.
 */
public class MoedaFactory {
    public static Moeda criarMoeda(Pais pais){
        if(pais.equals(Pais.BRASIL)){
            return new Real();
        }else if(pais.equals(Pais.EUA)){
            return new USDolar();
        }
        throw new IllegalArgumentException("Nao existe esse pais");
    }
}
