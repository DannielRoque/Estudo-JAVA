package br.com.javacore.sobrecargaconstrutores4.test;

import br.com.javacore.sobrecargaconstrutores4.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("Daniel", "123", new double[]{7,5,9});
        Estudante est2 = new Estudante("Daniel", "123", new double[]{7,5,9}, "123456");
        est.imprime();
        est2.imprime();
    }
}
