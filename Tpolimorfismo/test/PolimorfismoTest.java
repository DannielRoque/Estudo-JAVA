package br.com.javacore.Tpolimorfismo.test;

import br.com.javacore.Tpolimorfismo.classes.Funcionario;
import br.com.javacore.Tpolimorfismo.classes.Gerente;
import br.com.javacore.Tpolimorfismo.classes.RelatorioPagamento;
import br.com.javacore.Tpolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("José", 5000,45000);
        Vendedor v = new Vendedor("João", 2000,70000);
        RelatorioPagamento r = new RelatorioPagamento();
        r.relatorioPagamentoGenerico(g);
        System.out.println("----------------------------------------------------------");
        r.relatorioPagamentoGenerico(v);


    }



}
