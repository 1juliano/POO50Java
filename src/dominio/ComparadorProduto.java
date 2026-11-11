package dominio;

public class ComparadorProduto {
    public Produto retornarProdutoMaisCaro(Produto produto1, Produto produto2){
        if (produto1.preco>produto2.preco){
            return produto1;
        }else{
            return produto2;
        }
    }
}
