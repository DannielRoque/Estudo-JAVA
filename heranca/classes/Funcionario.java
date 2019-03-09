package br.com.javacore.heranca.classes;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    {
        System.out.println("Bloco de inicialização funcionario 1");
    }
    {
        System.out.println("Bloco de inicialização funcionario 2");
    }
    static{
        System.out.println("Bloco de inicialização funcionario static");
    }
    public void imprime(){
    super.imprime();
        System.out.println("Salário: "+this.salario);
        imprimeRelatorioPagamento();
    }
    public void imprimeRelatorioPagamento(){
        System.out.println("Eu "+super.nome+" Recebi "+this.salario);
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double sal){
        this.salario = sal;
    }
}
