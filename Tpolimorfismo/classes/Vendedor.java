package br.com.javacore.Tpolimorfismo.classes;

public class Vendedor extends Funcionario{
    private double totalVendas;

    public Vendedor(String nome, double salario, double totalVendas){
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    public void calcularPagamento(){
        this.salario += (totalVendas * 0.05);
    }
    public double getTotalVendas(){
        return this.totalVendas;
    }

    public void setTotalVendas(double tt){
        this.totalVendas = tt;
    }

}
