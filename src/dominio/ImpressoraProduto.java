package dominio;
public class ImpressoraProduto {

    public void imprime(Produto produto) {
        double total = produto.calcularValorTotal(produto.preco, produto.quantidade);

        System.out.printf("""
                nome: %s
                preco: %.2f
                quantidade: %d
                valor total: %.2f
                """,
                produto.nome,
                produto.preco,
                produto.quantidade,
                total);
    }
}
