package br.com.javacore.OException.test.Test;


import java.io.FileNotFoundException;

public class ChekedExceptionTest {
    public static void main(String[] args) {

    try{
        throw  new ArithmeticException();
    }catch (ArithmeticException | IllegalArgumentException | IndexOutOfBoundsException e){
        System.out.println("Aritmetic");

    }
    }
}
