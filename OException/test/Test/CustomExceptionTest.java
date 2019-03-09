package br.com.javacore.OException.test.Test;

import br.com.javacore.OException.test.customexceptions.LoginInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try{
            Logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void Logar() throws LoginInvalidoException {
        String usuarioBancoDados = "Goku";
        String senhaBancoDeDados = "111";
        String usuariodigitado = "Goku";
        String senhaDigitada = "123";
        if(!usuarioBancoDados.equals(usuariodigitado) || !senhaBancoDeDados.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Logado");
        }
    }
}
