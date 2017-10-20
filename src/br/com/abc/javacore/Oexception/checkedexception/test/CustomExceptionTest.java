package br.com.abc.javacore.Oexception.checkedexception.test;

import br.com.abc.javacore.Oexception.customexceptions.LoginInvalidoException;

/**
 * Created by William Suane on 6/22/2016.
 */
public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        String usuarioBancoDeDados = "Goku";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";
        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Logado");
        }
    }
}
