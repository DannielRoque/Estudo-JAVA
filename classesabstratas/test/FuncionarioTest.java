package br.com.javacore.classesabstratas.test;

import br.com.javacore.classesabstratas.classes.Funcionario;
import br.com.javacore.classesabstratas.classes.Gerente;
import br.com.javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Daniel", "4552-1", 2500);
        Vendedor v = new Vendedor("thais", "458785-4", 1500,15000);
        g.calculaSalario();
        v.calculaSalario();
        System.out.println(g);
        System.out.println("---------------------------------------------");
        System.out.println(v);

    }
}
