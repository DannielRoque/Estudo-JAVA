package br.com.javacore.introducaometodos2.classes;

public class Professor {
    public String nome;
    public String matricula;
    public int rg;
    public int cpf;



    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.rg);
        System.out.println(this.cpf);
    }
}
