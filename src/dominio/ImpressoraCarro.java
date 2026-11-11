package dominio;

public class ImpressoraCarro {
    public void imprime(Carro carro) {
        System.out.printf("""
                %s
                %s, ano %d - velocidadeAtual: %d
                """,
                carro.nome,
                carro.modelo,
                carro.ano,
                carro.velocidadeAtual);
    }
}

