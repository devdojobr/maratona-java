package br.com.abc.introducao.arrays;

/**
 * Created by William Suane on 3/8/2016.
 */
public class Arrays6 {
    public static void main(String[] args) {
        int[] arrInt = {1,2,3};
        int[] arrInt2 = new int[3];
        int[] arrInt3 = new int[] {1,2,3};

//        int[][] dias = new int[3][];
//        dias[0] = new int[2];
//        dias[1] = new int[]{1,2,3};
//        dias[2] = new int[4];

        int[][] dias = {{0,0},{1,2,3},{0,0,0,0}};

        // qual é o valor da posicao [1][2] = 3
        for(int[] arr : dias){
            for(int num : arr){
                System.out.println(num);
            }
        }
    }
}
