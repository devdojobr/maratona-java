package br.com.abc.introducao.controlefluxo;

/**
 * Created by William Suane on 2/26/2016.
 */
public class ExercicioControleFluxo3 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 até 100000
        int valor = 50000;
        for(int i=0;i<=valor; i++){
            if(i%2!=0) {
                System.out.println(i);
            }
        }
    }
}
