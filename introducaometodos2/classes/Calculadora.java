package br.com.javacore.introducaometodos2.classes;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10*3);
    }
    public void subtraiDoisNumeros(){
        System.out.println(12-5);
    }
    public double divideDoisNumeros(double num1, double num2){
        return num1/num2;
    }
    public String nomeMaisSobrenome(String nome, String sobrenome){
        return nome + sobrenome;
    }
    public void multiDoisNum(int num, int num2){
    if(num2!=0){
        System.out.println(num*num2);
        return;
    }
        System.out.println("Numero inválido");
    }


    public void alteraDoisNumero(int num1, int num2){
         num1=5;
         num2=10;
        System.out.println("Num1 "+num1+" Num2 "+num2);
    }
    public void somarArray(int[] numeros){
        int soma =0;
        for(int num : numeros){
            soma+=num;
        }
        System.out.println(soma);
    }
    public void varArgs(int...numeros){
        int soma=0;
        for(int num : numeros){
            soma+=num;
        }
        System.out.println(soma);
    }
}
