package br.com.javacore.modificadorfinal.test;

import br.com.javacore.modificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Goku");
        System.out.println(c.getComprador());

    }
}
