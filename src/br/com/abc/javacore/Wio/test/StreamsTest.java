package br.com.abc.javacore.Wio.test;

import java.io.*;

/**
 * Created by William Suane on 8/17/2016.
 */
public class StreamsTest {
    public static void main(String[] args) {
        leitorTunado();
    }

    private static void gravador() {
        byte[] dados = {65, 66, 67, 68, 69, 70};
        try (FileOutputStream gravador = new FileOutputStream("pasta/stream.txt")) {
            gravador.write(dados);
            gravador.flush();
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void gravadorTunado() {
        byte[] dados = {65, 66, 67, 68, 69, 70};
        try (BufferedOutputStream gravadorBuffer = new BufferedOutputStream (new FileOutputStream("pasta/stream.txt"),4098)) {
            gravadorBuffer.write(dados);
            gravadorBuffer.flush();
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitor() {
        try (FileInputStream leitor = new FileInputStream("pasta/stream.txt")) {
            int leitura;
            while ((leitura = leitor.read()) != -1) {
                byte b = (byte) leitura;
                System.out.println(" "+b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void leitorTunado() {
        try (BufferedInputStream leitorBuffer = new BufferedInputStream (new FileInputStream("pasta/stream.txt"),4098)) {
            int leitura;
            while ((leitura = leitorBuffer.read()) != -1) {
                byte b = (byte) leitura;
                System.out.println(" "+b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
