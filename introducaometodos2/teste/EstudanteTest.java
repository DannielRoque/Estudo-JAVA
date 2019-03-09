package br.com.javacore.introducaometodos2.teste;

import br.com.javacore.introducaometodos2.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante();
        est.setNome("Daniel");
        est.setIdade(25);
        double[] arrai = new double[]{4,6,8};
        est.setNotas(arrai);

        est.imprimir();

        System.out.println("\n Aprovado "+est.isAprovado());
    }
}
