package br.com.javacore.introducaometodos2.teste;

import br.com.javacore.introducaometodos2.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        System.out.println(calc.divideDoisNumeros(20, 10));
        double res = calc.divideDoisNumeros(40,10);
        System.out.println(res);
        String nome = calc.nomeMaisSobrenome("Daniel ", "Roque");
        System.out.println(nome);

        calc.multiDoisNum(5, 0);

        int[] numeros = new int[]{5,6,3,4,5};
        calc.somarArray(numeros);

        calc.varArgs(1,2,3,4,5);
    }
}
