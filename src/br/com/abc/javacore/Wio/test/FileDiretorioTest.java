package br.com.abc.javacore.Wio.test;

import java.io.File;
import java.io.IOException;

/**
 * Created by William Suane on 8/2/2016.
 */
public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {
//        File diretorio = new File("folder");
//        boolean mkdir = diretorio.mkdir();
//        System.out.println("Diretorio Criado " + mkdir);
//        File arquivo = new File(diretorio,"arquivo.txt");
//        boolean newFile = arquivo.createNewFile();
//        System.out.println("Arquivo criado " + newFile);
//        File arquivoNovoNome = new File(diretorio,"arquivo_renomeado.txt");
//        boolean renamed = arquivo.renameTo(arquivoNovoNome);
//        System.out.println("Renomeado "+renamed);
//        File diretorioRenomeado = new File("folder2");
//        boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
//        System.out.println("diretorio renomeado: "+diretorioRenamed);
        buscarArquivos();
    }

    public static void buscarArquivos() {
        File file = new File("C:\\Users\\GCUIT\\Google Drive\\GCU\\JavaOnline");
        String[] list = file.list();
        for (String arquivo : list) {
            System.out.println(arquivo);
        }
    }
}


