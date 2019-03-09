package br.com.javacore.heranca.classes;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;

    }

        public String toString(){
        return "nome: "+nome+ "cpf: "+cpf;
        }
    {
        System.out.println("Bloco 2 Pessoa");
    }
    static{
        System.out.println("Bloco static Pessoa");
    }
    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Endereco: "+this.endereco.getRua());
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
