package br.com.javacore.OException.test.customexceptions;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException(){
        super("Usuario ou senha inválido");
    }
}
