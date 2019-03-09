package br.com.javacore.Tpolimorfismo.classes;

public class Gerente extends Funcionario{
    private double pnl;

    public Gerente(String nome, double salario, double pnl){
        super(nome, salario);
        this.pnl=pnl;
    }

    public void calcularPagamento(){
        this.salario += pnl;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
}
