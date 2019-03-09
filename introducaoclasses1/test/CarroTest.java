package br.com.javacore.introducaoclasses1.test;

import br.com.javacore.introducaoclasses1.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo="Fusca";
        carro.placa="CFG-5454";
        carro.velocidadeMaxima=150;

        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }
}
