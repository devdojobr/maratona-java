package br.com.abc.javacore.Oexception.runtimeexception.test;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by William Suane on 6/16/2016.
 */
public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        }
        System.out.println("final do programa");

        try {
            talvezLanceException();
        } catch (Exception e) {

        }
    }

    private static void talvezLanceException() throws SQLException, AWTException, IOException {

    }
}
