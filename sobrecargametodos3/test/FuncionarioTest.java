package br.com.javacore.sobrecargametodos3.test;

import br.com.javacore.sobrecargametodos3.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.init("joaquim","111.222.333-44", 4500);
        func.imprimir();
    }
}
