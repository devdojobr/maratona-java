import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by William Suane on 11/7/2016.
 */
class AcharTodosArquivos extends SimpleFileVisitor<Path> {

//        @Override
//    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//        if (file.getFileName().toString().contains("Java PT_BR")) {
//            Path des = Paths.get("G:\\CLASS 01 TO 77\\Videos PT\\"+file.getFileName());
//            Path move = Files.copy(file, des);
//        }
//        return FileVisitResult.CONTINUE;
//    }
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().contains("Java PT_BR class")) {
            String[] split = file.getFileName().toString().split("-");
            split[0] = split[0].replace("Java PT_BR class", "Java PTBR Aula");
            System.out.println(split[0] + "-" + split[1]);

            Files.move(file, file.resolveSibling(split[0] + "-" + split[1]));


        }
        return FileVisitResult.CONTINUE;
    }
}

public class Test {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("G:\\CLASS 01 TO 77\\Videos PT"), new AcharTodosArquivos());
    }
}
//    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//        if (file.getFileName().toString().contains("Java ENG class")) {
//            String[] split = file.getFileName().toString().split("-");
//            split[0] = split[0].replace("Java ENG class","Java EN Aula");
//            System.out.println(split[0]+"-"+split[1]);
//            Files.move(file,file.resolveSibling(split[0]+"-"+split[1]));
//        }
//        return FileVisitResult.CONTINUE;
//    }