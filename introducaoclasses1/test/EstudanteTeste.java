package br.com.javacore.introducaoclasses1.test;

import br.com.javacore.introducaoclasses1.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome="Daniel";
        joao.matricula="123";
        joao.idade=15;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);

    }
}
