package br.com.javacore.exerciciosassociacao.exercicio1;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(){
    }

    public void print() {
        System.out.println("----Relatório Aluno----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.seminario != null)
            System.out.println("Seminário inscrito: " + this.seminario.getTitulo());
        else
            System.out.println("Aluno não inscrito ");

    }
    public Seminario getSeminario(){
        return this.seminario;
    }
    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
