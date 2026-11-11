package teste;

import dominio.Professor;

public class ProfessorTeste01 {
    static void main(String[] args) {
        Professor professor= new Professor();
        professor.nome="Rafael Mauricio";
        professor.disciplina="Analise e desenvolvimento de sistemas";
        professor.idade=27;
        professor.salario=1600;
        System.out.printf("""
                nome:%s
                disciplina:%s
                idade:%d
                salario:%.2f
                """,professor.nome,professor.disciplina,professor.idade,professor.salario);
    }
}
