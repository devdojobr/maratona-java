package br.com.abc.javacore.Oexception.customexceptions;

/**
 * Created by William Suane on 6/22/2016.
 */
public class LoginInvalidoException extends Exception {

    public LoginInvalidoException(){
        super("Usuario ou senha inválidos");
    }
}
