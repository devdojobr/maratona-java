package br.com.abc.javacore.Xnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by William Suane on 8/11/2016.
 */
public class DirectoryStreamTest {
    public static void main(String[] args) {
        Path dir = Paths.get("pasta/subpasta/subsubpasta");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for(Path path : stream){
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
