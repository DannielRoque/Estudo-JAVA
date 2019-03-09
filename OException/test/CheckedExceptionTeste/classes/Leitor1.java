package br.com.javacore.OException.test.CheckedExceptionTeste.classes;

public class Leitor1 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Fechando Leitor");
    }
}
