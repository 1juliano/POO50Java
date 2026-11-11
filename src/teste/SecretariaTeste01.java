package teste;
import dominio.Aluno;
import dominio.Secretaria;

    public class SecretariaTeste01 {

        public static void main(String[] args) {

            Aluno aluno = new Aluno();
            Secretaria secretaria = new Secretaria();

            aluno.nome = "João";
            aluno.nota1 = 4;
            aluno.nota2 = 5;

            System.out.println("Aluno: " + aluno.nome);

            System.out.println("Situação antes:");
            aluno.imprimirSituacao();

            secretaria.atualizarAluno(aluno, 8, 9);

            System.out.println("\nSituação depois:");
            aluno.imprimirSituacao();
        }
    }


