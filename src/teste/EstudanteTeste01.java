package teste;

import dominio.Estudante;
import dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante.nome = "Juliano";
        estudante.sexo = 'M';
        estudante.idade = 20;
        impressora.imprimeEstudante(estudante);
    }
}
