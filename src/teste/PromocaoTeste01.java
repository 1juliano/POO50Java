package teste;

import dominio.Produto;
import dominio.Promocao;

public class PromocaoTeste01 {
    static void main(String[] args) {
        Promocao promocao = new Promocao();
        Produto produto = new Produto();
        produto.nome="Notebook";
        produto.preco=2000;
        System.out.println("Preço antes: " + produto.preco);
        promocao.aplicarDesconto(produto,10);
        System.out.println("Preço depois: " + produto.preco);
    }
}
