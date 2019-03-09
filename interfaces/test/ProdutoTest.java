package br.com.javacore.interfaces.test;

import br.com.javacore.interfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 2,3500);
        p.calculaFrete();
        p.calculaImposto();
        System.out.println(p);
    }
}
