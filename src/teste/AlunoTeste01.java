package teste;

import dominio.Aluno;

public class AlunoTeste01 {
    static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        aluno.nome="Juliano";
        aluno.nota1=10;
        aluno.nota2=8;
        aluno2.nome="Lucas";
        aluno2.nota1=6;
        aluno2.nota2=5;
        aluno3.nome="Matheus";
        aluno3.nota1=3;
        aluno3.nota2=4;
        System.out.printf("""
                
                        ============================
                              DADOS DO ALUNO
                        ============================
                        Nome: %s
                        Nota 1: %d
                        Nota 2: %d
                        
                
                        ============================
                              DADOS DO ALUNO
                        ============================
                        Nome: %s
                        Nota 1: %d
                        Nota 2: %d
                       
                
                        ============================
                              DADOS DO ALUNO
                        ============================
                        Nome: %s
                        Nota 1: %d
                        Nota 2: %d
                                    
                """,aluno.nome,aluno.nota1,aluno.nota2,aluno2.nome,aluno2.nota1,aluno2.nota2,aluno3.nome,aluno3.nota1,aluno3.nota2);
        aluno.calcularMedia(aluno.nota1,aluno.nota2);
        System.out.printf("Média: %.1f%n", aluno.media);
        System.out.printf("Situação: %s%n", aluno.getSituacao());
        aluno2.calcularMedia(aluno2.nota1,aluno2.nota2);
        System.out.printf("Média: %.1f%n", aluno2.media);
        System.out.printf("Situação: %s%n", aluno2.getSituacao());
        aluno3.calcularMedia(aluno3.nota1,aluno3.nota2);
        System.out.printf("Média: %.1f%n", aluno3.media);
        System.out.printf("Situação: %s%n", aluno3.getSituacao());
        aluno.nota1 = 5;
        aluno.nota2 = 6;

        System.out.println("Notas antigas: " + aluno.nota1 + " e " + aluno.nota2);

        aluno.atualizarNotas(8, 9);

        System.out.println("Notas novas: " + aluno.nota1 + " e " + aluno.nota2);
    }

}
