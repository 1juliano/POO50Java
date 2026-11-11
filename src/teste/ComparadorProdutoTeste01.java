package teste;

import dominio.ComparadorProduto;
import dominio.Produto;

public class ComparadorProdutoTeste01 {
    static void main(String[] args) {
        Produto produto = new Produto();
        Produto produto2 = new Produto();
        ComparadorProduto comparadorProduto = new ComparadorProduto();
        produto.nome="Pasta de dente";
        produto.preco=20;
        produto2.nome="Sabao em po";
        produto2.preco=18;
        produto.calcularValorTotal(10,5);
        produto2.calcularValorTotal(9,2);
        Produto melhorProduto= comparadorProduto.retornarProdutoMaisCaro(produto,produto2);
        System.out.println(melhorProduto.nome);
    }
}
