package br.com.javacore.introducaometodos2.classes;

public class Estudante {
    private String nome;
    private int idade;
    private String resp;
    private double[] notas;
    private boolean aprovado;

    public void mediaNotas(double[] notas) {
        double res = 0;
        for (double nots : notas) {
            res += nots;
        }
        res = res / notas.length;
        if (res < 6) {
            this.aprovado=false;
            resp = "reprovado";
        } else {
            this.aprovado=true;
            resp = "aprovado";
        }
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(this.notas != null){
            for(double nota : this.notas){
                System.out.printf(" "+nota);
            }
        }
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
    public double[] getNotas(){
        return this.notas;
    }
    public void setNotas(double[] notas){
        this.notas=notas;
    }
    public boolean isAprovado(){
        return this.aprovado;
    }

}
