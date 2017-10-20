package br.com.abc.javacore.ZZGcomportamentoporparametro.predicate;

import br.com.abc.javacore.ZZGcomportamentoporparametro.classes.Carro;
import br.com.abc.javacore.ZZGcomportamentoporparametro.interfaces.CarroPredicate;

/**
 * Created by William Suane on 11/18/2016.
 */
public class CarrosCorVerdePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
    }
}
