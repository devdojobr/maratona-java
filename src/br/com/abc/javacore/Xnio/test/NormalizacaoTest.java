package br.com.abc.javacore.Xnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by William Suane on 8/8/2016.
 */
public class NormalizacaoTest {
    public static void main(String[] args) {
        String diretorioProjeto = "JavaOnline\\home\\william\\dev";
        String arquivoTxt = "..\\..\\arquivo.txt";
        Path p1 = Paths.get(diretorioProjeto,arquivoTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());
        Path p2 = Paths.get("a/./b/./c");
        System.out.println(p2);
        System.out.println(p2.normalize());
    }
}
