package teste;

import dominio.ImpressoraProduto;
import dominio.Produto;

public class ProdutoTeste01 {
    static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome="Iphone";
        produto.preco=5500;
        produto.quantidade=2;
        String msg=produto.estoqueBaixo(5)? "estoque baixo": "";
        double total= produto.calcularValorTotal(5,6);
        String isCategoria=produto.verificarCategoria(76);
        double desconto= produto.aplicarDesconto(5);
        double novoPreco= produto.aumentarPreco(5);
        double taxa= produto.calcularFrete(25);
        ImpressoraProduto inpressora = new ImpressoraProduto();
        inpressora.imprime(produto);






    }
}
