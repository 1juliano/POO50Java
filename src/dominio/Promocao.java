package dominio;

public class Promocao {
    public void aplicarDesconto(Produto produto, double porcentagem) {
        double desconto = produto.preco * (porcentagem / 100);
        produto.preco=produto.preco - desconto;
    }
}
