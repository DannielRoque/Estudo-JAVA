package br.com.javacore.classesabstratas.classes;

public class Gerente extends Funcionario {
    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }
    public void calculaSalario(){
        this.salario = salario +(salario * 0.1);
    }
}
