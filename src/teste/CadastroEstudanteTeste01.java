package teste;

import dominio.CadastroEstudante;
import dominio.Estudante;
import dominio.ImpressoraEstudante;

public class CadastroEstudanteTeste01 {
    static void main(String[] args) {
        CadastroEstudante cadastroEstudante = new CadastroEstudante();
        Estudante estudante = new Estudante();
        ImpressoraEstudante Impressora = new ImpressoraEstudante();
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        cadastroEstudante.cadastrar(estudante1,"Juliano",20,'M');
        cadastroEstudante.cadastrar(estudante2,"Jucimara",34,'F');
        Impressora.imprimeEstudante(estudante1);
        Impressora.imprimeEstudante(estudante2);

    }
}
