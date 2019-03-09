package br.com.javacore.livrojava.test;

import br.com.javacore.livrojava.exercicio.Time;

public class TimeTest {
    public static void main(String[] args ){
        Time time1 = new Time(); // invocando contrutor classe Time

        System.out.println("O Iniciar universal do tempo é: ");
        System.out.println(time1.toUniversalString());
        System.out.println("O horário inicial padrão é ");
        System.out.println(time1.toString());
        System.out.println();

        //alterando data/hora e gerando saída atualizada
        time1.setTime(13, 27, 6);
        System.out.println("After attempting invalid settings");
        System.out.println(time1.toUniversalString());
        System.out.println("Standard time after setTime is:");
        System.out.println(time1.toString());
        System.out.println();

        //configura data/hora com valores inválidos
        time1.setTime(99,99,99);
        System.out.println("After attempting invalid settings");
        System.out.println("Universal time");
        System.out.println(time1.toUniversalString());
        System.out.println("Standard time");
        System.out.println(time1.toString());
    }//fim da main
}//fim da classe
