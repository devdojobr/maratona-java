package br.com.abc.javacore.Yserializacao.test;

import br.com.abc.javacore.Yserializacao.classes.Aluno;
import br.com.abc.javacore.Yserializacao.classes.Turma;

import java.io.*;

/**
 * Created by William Suane on 8/19/2016.
 */
public class SerializacaoTest {
    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();
    }


    private static void gravadorObjeto() {
        Turma t = new Turma("Maratona Java, só para os campeões");
        Aluno aluno = new Aluno(1L, "William Suane", "123456");
        aluno.setTurma(t);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitorObjeto() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
