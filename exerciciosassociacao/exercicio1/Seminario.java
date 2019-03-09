package br.com.javacore.exerciciosassociacao.exercicio1;

public class Seminario {
    private String titulo;
    public Aluno[] aluno;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }
    public Seminario(){
    }
    public void print(){
        System.out.println("----Relatório seminario----");
        if(aluno != null && aluno.length !=0){
            for(Aluno alunos : aluno){
                System.out.println("Aluno: "+alunos.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno associado");
        System.out.println("");
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Professor: "+this.professor.getNome());
        if(this.local != null)
        System.out.println("Local: "+this.local.getRua()+""+this.local.getBairro());
        else
            System.out.println("Nenhum local vinculado");
    }
    public Local getLocal() {
        return local;
    }
    public void setLocal(Local local) {
        this.local = local;
    }
    public Aluno[] getAluno() {
        return aluno;
    }
    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
