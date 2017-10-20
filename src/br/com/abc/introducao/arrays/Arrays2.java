package br.com.abc.introducao.arrays;

/**
 * Created by William Suane on 3/2/2016.
 */
public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double = 0
        // char '\u0000' ' '
        //boolean false;
        // reference  null
        String[] nomes = new String[3];
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";

        for(int i=0; i<nomes.length;i++){
            System.out.println((i + 1) + " nome "+nomes[i]);
        }

        nomes = new String[4];


     }
}
