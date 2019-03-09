package br.com.javacore.heranca.test;

import br.com.javacore.heranca.classes.Endereco;
import br.com.javacore.heranca.classes.Funcionario;
import br.com.javacore.heranca.classes.Pessoa;

public class Test {
    public static void main(String[] args) {
    Pessoa p = new Pessoa("Daniel");
    Endereco e = new Endereco();
    p.setCpf("1234");
    e.setRua("José da Silva");
    e.setBairro("Mariana");
    p.setEndereco(e);
    //p.imprime();
        System.out.println(p.toString());
        System.out.println("_-------------=============---------------_");

        Funcionario f = new Funcionario("João");
        //f.setCpf("12343434");
        //f.setSalario(15000);
        f.setEndereco(e);
        f.imprime();
    }
}
