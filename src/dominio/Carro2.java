package dominio;

public class Carro2 {
    public String nome;
    public String modelo;
    public int ano;
    public double velocidadeAtual;

    public boolean isMultado(int limiteDaVia) {
        return velocidadeAtual > limiteDaVia;
    }

    public String gerarMensagemMulta(int limiteDaVia) {
        if (isMultado(limiteDaVia)) {
            return "Carro multado! Ultrapassou o limite da via.";
        } else {
            return "Carro dentro do limite da via.";
        }
    }
}
