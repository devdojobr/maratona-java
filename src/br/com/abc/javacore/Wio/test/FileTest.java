package br.com.abc.javacore.Wio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by William Suane on 8/1/2016.
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            System.out.println(file.createNewFile());
            boolean exists = file.exists();
            System.out.println("Permissao de leitura? "+file.canRead());
            System.out.println("path "+file.getPath());
            System.out.println("path "+file.getAbsolutePath());
            System.out.println("diretorio? "+file.isDirectory());
            System.out.println("hidden? "+file.isHidden());
            System.out.println("last modified? "+new Date(file.lastModified()));
            if(exists){
                System.out.println("Deletado? "+file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
