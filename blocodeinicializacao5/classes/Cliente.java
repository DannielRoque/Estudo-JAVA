package br.com.javacore.blocodeinicializacao5.classes;

public class Cliente {
    //velocidade limite 240km
    private String nome;
    private double velocidade;
    public static double velocidadeLimite = 240;

    public Cliente(String nome, double velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public void imprime() {
        System.out.println("------------------------------------------------------");
        System.out.println(this.nome);
        System.out.println(this.velocidade+" Km por hora");
        System.out.println("Velocidade Limite " + velocidadeLimite);
    }

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
