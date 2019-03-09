package br.com.javacore.blocoestatico6.classes;

public class Cliente {
    //0- Bloco de inicialização estático é inicializado quando a JVM carregar a classe ( é executado apenas uma vez).
    //1- Alocado espaco na memoria para o objeto que será criado
    //2- Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    //3- Bloco de inicialização é executado
    //4- o contrutor é executado

    private int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização");
        for(int i=1; i<=parcelas.length;i++){
            parcelas[i-1]=i;
        }
    }
    public Cliente(){

    }
    public int[] getParcelas(){
        return parcelas;
    }
    public void setParcelas(int[] parcelas){
        this.parcelas=parcelas;
    }

}