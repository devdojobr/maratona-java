package br.com.abc.javacore.ZZGcomportamentoporparametro.interfaces;

import br.com.abc.javacore.ZZGcomportamentoporparametro.classes.Carro;

/**
 * Created by William Suane on 11/18/2016.
 */
@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
}
