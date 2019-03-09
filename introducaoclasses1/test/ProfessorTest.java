package br.com.javacore.introducaoclasses1.test;

import br.com.javacore.introducaoclasses1.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();

        prof.nome="Vaxo";
        prof.matricula="1254";
        prof.rg=123456;
        prof.cpf=123456;

        System.out.println(prof.nome);
        System.out.println(prof.matricula);
        System.out.println(prof.rg);
        System.out.println(prof.cpf);
    }
}

