package dominio;

public class CadastrarCarro2 {
    public void cadastrar(Carro2 carro, String nome, String modelo, int ano, double velocidadeAtual) {

        carro.nome = nome;
        carro.modelo = modelo;
        carro.ano = ano;
        carro.velocidadeAtual = velocidadeAtual;
    }
}
