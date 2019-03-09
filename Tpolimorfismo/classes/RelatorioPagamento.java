package br.com.javacore.Tpolimorfismo.classes;

public class RelatorioPagamento {

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatório de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Salário: "+funcionario.getSalario());
        if(funcionario instanceof Gerente){
            System.out.println("Participação nos Lucros: "+((Gerente) funcionario).getPnl());
        }
        if(funcionario instanceof Vendedor){
            System.out.println("Total Vendas: "+((Vendedor) funcionario).getTotalVendas());
        }
    }
}
