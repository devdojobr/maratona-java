package br.com.abc.javacore.Xnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by William Suane on 8/9/2016.
 */
public class AtributosBasicosTest {
    public static void main(String[] args) throws IOException {
        Date primeiroDeDezemebro = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
        File file = new File("folder2\\arquivo.txt");
        file.createNewFile();
        file.setLastModified(primeiroDeDezemebro.getTime());
        System.out.println(file.lastModified());
        file.delete();
        Path path = Paths.get("folder2\\arquivo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.fromMillis(primeiroDeDezemebro.getTime());
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);

        path = Paths.get("src\\br\\com\\abc\\javacore\\Aintroducaoclasses\\classes\\Carro.java");
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));
        // BasicFileAttributes, PosixFileAttributes, DosFileAttributes
        BasicFileAttributes atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("create "+ atributosBasicos.creationTime());
        System.out.println("lastAccess "+ atributosBasicos.lastAccessTime());
        System.out.println("LastModified "+ atributosBasicos.lastModifiedTime());
        System.out.println("-------------------------------");
//        System.out.println(atributosBasicos.isDirectory());
//        System.out.println(atributosBasicos.isSymbolicLink());
//        System.out.println(atributosBasicos.isRegularFile());

        // BasicFileAttributeView, PosixFileAttributeView, DosFileAttributeView, FileOwnerAttributeView, AclFileAttributeView
        FileTime lastModified = atributosBasicos.lastModifiedTime();
        FileTime created = atributosBasicos.creationTime();
        FileTime lastAcess = FileTime.fromMillis(System.currentTimeMillis());
        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        basicView.setTimes(lastModified,lastAcess,created);
        atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("create "+ atributosBasicos.creationTime());
        System.out.println("lastAccess "+ atributosBasicos.lastAccessTime());
        System.out.println("LastModified "+ atributosBasicos.lastModifiedTime());


    }
}
