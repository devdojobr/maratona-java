package br.com.abc.javacore.Xnio.test;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by William Suane on 8/30/2016.
 */
public class ZipandoTest {
    public static void main(String[] args) {
        /*Esse é o path em que será salvo o arquivo.zip, lembre-se como o path não começa com / estamos trabalhando com o
          *path relativo. Isso significa que dentro da pasta do meu projeto existe o diretório pasta/subpasta
          *ex: C:\MeuProjetoJava\pasta\subpasta
          *No final ficará C:\MeuProjetoJava\pasta\subpasta\arquivo.zip
          */
        Path dirZip = Paths.get("pasta/subpasta");
        /*Dentro deste diretório estão todos os arquivos que queremos zipar. Vamos zipar todos os arquivos que estiverem
        * no diretório C:\MeuProjetoJava\pasta\subpasta\subsubpasta
        */
        Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");
        /* O resolve vai juntar o primeiro path "pasta/subpasta" com o "arquivo.zip"
         * e utilizaremos a variável de referência zipFile para criar o arquivo.zip dentro do diretório pasta/subpasta.
         */
        Path zipFile = dirZip.resolve("arquivo.zip");
        // Ao ser executado esse try-with-resources vai criar o arquivo.zip imediatamente
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
             // Comos vamos zipar todos os arquivos do diretório dirFiles apenas iteramos sobre eles usando DirectoryStream
             DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)) {
            for (Path path : stream) {
                //Adicionamos ao arquivo.zip uma entrada ZipEntry, que será o arquivo que será copiado para dentro do zip
                zip.putNextEntry(new ZipEntry(path.getFileName().toString()));
                // O código abaixo copiará os dados do arquivo para o arquivo dentro do zip
                BufferedInputStream bf = new BufferedInputStream(new FileInputStream(path.toFile()));
                byte[] buff = new byte[2048];
                int bytesRead;
                while ((bytesRead = bf.read(buff)) > 0) {
                    zip.write(buff, 0, bytesRead);
                }
                zip.flush();
                zip.closeEntry();
                bf.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
