package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

/**
 * Created by William Suane on 3/10/2016.
 */
public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf ="111.122.131-20";
        prof.nome = "Jurandir";
        prof.rg = "20201-2";
        prof.matricula = "1121";

        Professor prof2 = new Professor();
        prof2.cpf ="222.222.222-22";
        prof2.nome = "Juciclei";
        prof2.rg = "9982-2";
        prof2.matricula = "0921C";

        prof = prof2;

        System.out.println(prof.cpf);
        System.out.println(prof.nome);
        System.out.println(prof.rg);
        System.out.println(prof.matricula);
        System.out.println("----------------------------");
        System.out.println(prof2.cpf);
        System.out.println(prof2.nome);
        System.out.println(prof2.rg);
        System.out.println(prof2.matricula);



    }
}
