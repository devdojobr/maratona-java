package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Professor;

/**
 * Created by William Suane on 3/24/2016.
 */
public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "122.222.232-20";
        prof.matricula = "11122";
        prof.nome = "Marcos";
        prof.rg = "122211-5";

        Professor prof2 = new Professor();
        prof2.cpf = "222.111.888-20";
        prof2.matricula = "44444";
        prof2.nome = "Joana";
        prof2.rg = "2122-6";

        prof.imprime();
        prof2.imprime();

//        prof.imprime(prof2);

    }
}
