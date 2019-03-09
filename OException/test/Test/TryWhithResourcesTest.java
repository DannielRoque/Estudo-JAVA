package br.com.javacore.OException.test.Test;

import br.com.javacore.OException.test.CheckedExceptionTeste.classes.Leitor1;
import br.com.javacore.OException.test.CheckedExceptionTeste.classes.Leitor2;

import java.io.*;

public class TryWhithResourcesTest {
    public static void main(String[] args) {

    }
    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){
        } catch (Exception e) {
            e.printStackTrace();
            }
        }



    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
