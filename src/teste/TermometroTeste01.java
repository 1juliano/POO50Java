package teste;

import dominio.Termometro;

public class TermometroTeste01 {
    static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.temparaturaAtual=41;
        String resultado = termometro.passouDoLimite(30) ? "passou do limite" : "nao passou do limite";
        System.out.println(resultado);
    }
}
