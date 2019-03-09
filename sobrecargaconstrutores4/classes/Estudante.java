package br.com.javacore.sobrecargaconstrutores4.classes;

public class Estudante {
    private String nome;
    private String matricula;
    private double[] notas;
    private String rg;

    public Estudante(String nome, String matricula, double[] notas){
        this.nome=nome;
        this.matricula=matricula;
        this.notas=notas;
    }
    public Estudante(String nome, String matricula, double[] notas, String rg){
        this(nome, matricula,notas);
        this.rg=rg;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for(double nota : notas){
            System.out.print(nota+ " ");
        }
        System.out.println("\n"+this.rg);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public double[] getNotas(){
        return this.notas;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }
    public String getRg(){
        return this.rg;
    }
    public void setEg(String rg){
        this.rg=rg;
    }
}
