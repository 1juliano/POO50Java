package teste;

import dominio.CadastroCarro;
import dominio.Carro;
import dominio.ImpressoraCarro;

public class CadastroCarroTeste01 {
    static void main(String[] args) {
        CadastroCarro cadastroCarro = new CadastroCarro();
        Carro carro = new Carro();
        ImpressoraCarro impressora= new ImpressoraCarro();
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        cadastroCarro.cadastrar(carro1,"Civic","Sedan",2000,150);
        cadastroCarro.cadastrar(carro2,"Honda","Sedan",2000,120);
        impressora.imprime(carro1);
        impressora.imprime(carro2);
    }
}
