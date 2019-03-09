package br.com.javacore.blocodeinicializacao5.test;

import br.com.javacore.blocodeinicializacao5.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente.velocidadeLimite = 200;
        Cliente c1 = new Cliente("Stella", 260);
        Cliente c2 = new Cliente("Joan", 240);
        Cliente c3 = new Cliente("Miran", 280);

        c1.imprime();
        c2.imprime();
        c3.imprime();


        System.out.println("############################################");
        Cliente.velocidadeLimite=150;
        c1.imprime();
        c2.imprime();
        c3.imprime();


    }


}
