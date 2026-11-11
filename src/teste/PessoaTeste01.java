package teste;

import dominio.Pessoa;

public class PessoaTeste01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome="Juliano";
        pessoa.idade=20;
        boolean resultado= pessoa.isMaiorDeIdade(18);
        System.out.println(resultado);
    }
}
