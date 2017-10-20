package br.com.abc.introducao.controlefluxo;

/**
 * Created by William Suane on 2/18/2016.
 */
public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        //Crie um switch que dado um valor de 1 a 7
        //Considerando 1 domingo imprima se é dia util ou final de semana
        byte dia = 8;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("fds");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("Opcao inválida");
        }
    }
}
