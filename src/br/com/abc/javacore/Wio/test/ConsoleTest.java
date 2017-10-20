package br.com.abc.javacore.Wio.test;

import java.io.Console;

/**
 * Created by William Suane on 8/2/2016.
 */
public class ConsoleTest {
    public static void main(String[] args) {
        Console c = System.console();
        char[] pw = c.readPassword("%s", "pw: ");
        for(char pass : pw){
            c.format("%c ", pass);
        }
        c.format("\n");
        String texto;
        while(true){
            texto = c.readLine("%s","Digite: ");
            c.format("esse texto %s foi digitado", retorno(texto));
        }
    }

    public static String retorno(String arg1){
        return arg1;
    }
}
