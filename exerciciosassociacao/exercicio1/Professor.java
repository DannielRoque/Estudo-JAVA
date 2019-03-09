package br.com.javacore.exerciciosassociacao.exercicio1;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public Professor(){
    }
    public void print(){
        System.out.println("----Relatório Professor----");
        System.out.println("Nome: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        if(seminario!=null && seminario.length !=0) {
            for (Seminario sem : seminario) {
                System.out.println("Seminario: " + sem.getTitulo());
            }
                return;
        }
        System.out.println("Professor não vinculado a seminário");
        }

    public Seminario[] getSeminario() {
        return seminario;
    }
    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
}
