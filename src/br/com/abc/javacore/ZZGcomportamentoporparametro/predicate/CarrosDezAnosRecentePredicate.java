package br.com.abc.javacore.ZZGcomportamentoporparametro.predicate;

import br.com.abc.javacore.ZZGcomportamentoporparametro.classes.Carro;
import br.com.abc.javacore.ZZGcomportamentoporparametro.interfaces.CarroPredicate;

import java.util.Calendar;

/**
 * Created by William Suane on 11/18/2016.
 */
public class CarrosDezAnosRecentePredicate implements CarroPredicate{
    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
    }
}
