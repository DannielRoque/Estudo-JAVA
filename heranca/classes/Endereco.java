package br.com.javacore.heranca.classes;

public class Endereco {

    private String rua;
    private String bairro;

    public String getRua() {
        return rua;
    }
    {
        System.out.println("teste endereço inicialização");
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
