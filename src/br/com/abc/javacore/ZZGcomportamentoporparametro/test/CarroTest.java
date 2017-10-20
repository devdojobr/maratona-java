package br.com.abc.javacore.ZZGcomportamentoporparametro.test;

import br.com.abc.javacore.ZZGcomportamentoporparametro.classes.Carro;
import br.com.abc.javacore.ZZGcomportamentoporparametro.interfaces.CarroPredicate;
import br.com.abc.javacore.ZZGcomportamentoporparametro.predicate.CarrosCorVerdePredicate;
import br.com.abc.javacore.ZZGcomportamentoporparametro.predicate.CarrosDezAnosRecentePredicate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

/**
 * Created by William Suane on 11/18/2016.
 */
public class CarroTest {
    private static List<Carro> filtrarCarroVerde(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getCor().equals("verde"))
                result.add(carro);
        }
        return result;
    }

    private static List<Carro> filtrarCarroVermelho(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getCor().equals("vermelho"))
                result.add(carro);
        }
        return result;
    }

    private static List<Carro> filtrarCarroPorCor(List<Carro> carros, String cor) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getCor().equals(cor))
                result.add(carro);
        }
        return result;
    }

    private static List<Carro> filtrarCarrosDezAnosFabricados(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10))
                result.add(carro);
        }
        return result;
    }

    public static List<Carro> filtrarCarros(List<Carro> carros, CarroPredicate carroPredicate) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carroPredicate.test(carro))
                result.add(carro);
        }
        return result;
    }

    public static <T> List<T> filtrar(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Carro> carros = asList(new Carro("verde", 2011), new Carro("vermelho", 1995), new Carro("preto", 2017));
        List<Integer> numeros = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println(filtrarCarroVerde(carros));
//        System.out.println(filtrarCarroVermelho(carros));
//        System.out.println(filtrarCarroPorCor(carros, "verde"));
//        System.out.println(filtrarCarroPorCor(carros, "vermelho"));
//        System.out.println(filtrarCarrosDezAnosFabricados(carros));
        System.out.println(filtrarCarros(carros, new CarrosCorVerdePredicate()));
        System.out.println(filtrarCarros(carros, new CarrosDezAnosRecentePredicate()));

        System.out.println(filtrarCarros(carros, (Carro carro) -> carro.getCor().equals("verde")));
        System.out.println(filtrar(carros, new Predicate<Carro>(){
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        }));
        System.out.println(filtrar(numeros, integer -> integer % 2 == 0));
    }
}
