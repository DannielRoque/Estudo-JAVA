package br.com.javacore.exerciciosassociacao.exercicio1;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Daniel", 15);
        Aluno aluno2 = new Aluno("Denis",19);

        Seminario seminario = new Seminario("teste");
        Professor professor = new Professor("Machado","Turismo");
        Local local = new Local("Floripa","Hero");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAluno(new Aluno[]{aluno,aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0]= seminario;
        professor.setSeminario(semArray);

        seminario.print();
        professor.print();
        aluno.print();
        aluno2.print();
    }
}
