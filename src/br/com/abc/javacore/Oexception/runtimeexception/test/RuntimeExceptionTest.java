package br.com.abc.javacore.Oexception.runtimeexception.test;

/**
 * Created by William Suane on 6/8/2016.
 */
public class RuntimeExceptionTest {
    public static void main(String[] args) {
//        try{
            divisao(10,0);
//        }catch(RuntimeException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
    }

    private static void divisao(int num1, int num2)throws IllegalArgumentException{
        if(num2 == 0){
            throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
        }
        int result = num1/num2;
        System.out.println(result);
    }
}
