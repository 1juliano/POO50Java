package dominio;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double calcularValorTotal(double preco, double quantidade) {
        double resultado = preco * quantidade;
        return resultado;
    }

    public String verificarCategoria(double preco) {
        if (preco >= 1000) {
            return ("produto caro");
        } else {
            return ("produto barato");
        }
    }

    public double aplicarDesconto(double porcentagem) {
        double resultado = preco - (preco * 0.10);
        return resultado;
    }

    public double aumentarPreco(double porcentagem) {
        double novoPreco = preco + (preco * 0.20);
        return novoPreco;
    }
    public double calcularFrete(double taxaFrete){
        return preco+taxaFrete;
    }
    public boolean estoqueBaixo( int quantidadeMinima){
        return quantidade<quantidadeMinima;
    }
}

