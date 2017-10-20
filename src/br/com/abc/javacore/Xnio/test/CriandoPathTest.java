package br.com.abc.javacore.Xnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by William Suane on 8/2/2016.
 */
public class CriandoPathTest {
    public static void main(String[] args) {
        // C:\Users\GCUIT\Google Drive\GCU\JavaOnline
        Path p1 = Paths.get("C:\\Users\\GCUIT\\Google Drive\\GCU\\JavaOnline\\Arquivo.txt");
        Path p2 = Paths.get("C:\\Users\\GCUIT\\Google Drive\\GCU\\JavaOnline", "Arquivo.txt");
        Path p3 = Paths.get("C:", "Users\\GCUIT\\Google Drive\\GCU\\JavaOnline", "Arquivo.txt");
        Path p4 = Paths.get("C:", "Users", "GCUIT", "Google Drive", "GCU", "JavaOnline", "Arquivo.txt");
        System.out.println(p4.toAbsolutePath());
        File file = p4.toFile();
        Path path = file.toPath();

        Path path1 = Paths.get("pasta");
        Path path2 = Paths.get("pasta\\subpasta\\subsubpasta\\");
        Path arquivo = Paths.get("pasta\\subpasta\\subsubpasta\\file.txt");
        try {
//            if (Files.notExists(path1))
//                Files.createDirectory(path1);
            if (Files.notExists(path2.getParent()))
                Files.createDirectories(path2.getParent());
            if (Files.notExists(arquivo))
                Files.createFile(arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path source = Paths.get("folder2\\arquivo.txt");
        Path target = Paths.get(path2.toString() + "\\arquivoCopiado.txt");
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            Files.deleteIfExists(target);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
