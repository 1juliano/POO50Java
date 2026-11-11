package teste;

import dominio.Aluno;
import dominio.ComparadorAluno;

public class ComparadorAlunoTeste01 {
    static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        ComparadorAluno comparadorAluno = new ComparadorAluno();
        aluno.nome="juliano";
        aluno2.nome="lucas";
        aluno.nota1=10;
        aluno.nota2=10;
        aluno2.nota1=8;
        aluno2.nota2=7;
        aluno.calcularMedia(10,10);
        aluno.calcularMedia(8,7);
        Aluno melhorAluno=comparadorAluno.retornarAlunoComMaiorMedia(aluno,aluno2);
        System.out.println(melhorAluno.nome);

    }
}
