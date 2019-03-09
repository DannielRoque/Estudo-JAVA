package br.com.javacore.introducaometodos2.teste;

import br.com.javacore.introducaometodos2.classes.Calculadora;
import br.com.javacore.introducaometodos2.classes.Professor;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();


        calc.alteraDoisNumero(4, 5);

        Professor prof = new Professor();
        prof.nome="Daniel";
        prof.matricula="1245";
        prof.rg=123456;
        prof.cpf=654321;

        prof.imprime();
    }
}
