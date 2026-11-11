package teste;

import dominio.CadastrarProduto;
import dominio.ImpressoraProduto;
import dominio.Produto;

public class CadastrarProdutoTeste01 {
    static void main(String[] args) {
        CadastrarProduto cadastrarProduto = new CadastrarProduto();
        Produto produto = new Produto();
        ImpressoraProduto impressoraProduto = new ImpressoraProduto();
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        cadastrarProduto.cadastrar(produto1,"Bala",10,5);
        cadastrarProduto.cadastrar(produto2,"Escova",20,2);
        impressoraProduto.imprime(produto1);
        impressoraProduto.imprime(produto2);
    }
}
