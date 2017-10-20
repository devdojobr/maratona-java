package br.com.abc.javacore.Xnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

/**
 * Created by William Suane on 8/11/2016.
 */

class AcharTodosOsBkp extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (file.getFileName().toString().endsWith(".bkp")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}


public class FileVisitorTest {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("pasta/subpasta"), new PrintDirs());
    }
}


class PrintDirs extends SimpleFileVisitor<Path> {
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("pre: " + dir);
//        if(dir.getFileName().toString().equals("subsubpasta")){
//            return FileVisitResult.SKIP_SIBLINGS;
//        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println("file " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc)
            throws IOException {
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        System.out.println("post: " + dir);
        return FileVisitResult.CONTINUE;
    }
}