package dominio;

public class ImpressoraCarro2 {
    public void imprimir(Carro2 carro, int limiteDaVia) {

        System.out.println("Nome: " + carro.nome);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade atual: " + carro.velocidadeAtual + " km/h");

        System.out.println(carro.gerarMensagemMulta(limiteDaVia));

        System.out.println("-------------------------");
    }
}
