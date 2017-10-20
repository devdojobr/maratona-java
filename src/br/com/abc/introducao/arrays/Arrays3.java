package br.com.abc.introducao.arrays;

/**
 * Created by William Suane on 3/3/2016.
 */
public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};// tam =5, index  = 0 até 4
        int[] numeros3 = new int[]{1,2,3,4,5};


        for(int i =0 ; i<numeros2.length; i++){
            System.out.println(numeros2[i]);
        }

        for(int num : numeros2){
            System.out.println(num);
        }

    }
}
