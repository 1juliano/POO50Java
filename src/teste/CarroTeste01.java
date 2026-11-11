package teste;

import dominio.Carro;
import dominio.ImpressoraCarro;

public class CarroTeste01 {
    static void main(String[] args) {
        Carro carro = new Carro();
        ImpressoraCarro inpressora = new ImpressoraCarro();
        carro.nome="Lancer";
        carro.modelo="Sedan";
        carro.ano=2000;
        carro.velocidadeAtual=0;
        String classificaçao=carro.verificarIdadeCarro(2000);
         boolean isMultado=carro.isMultado(100);
        String msgMulta=carro.gerarMensagemMulta(100);
        inpressora.imprime(carro);
        carro.imprimirMulta(60);
        carro.velocidadeAtual = 40;
        System.out.println("Velocidade antes: " + carro.velocidadeAtual);
        carro.acelerar(20);
        System.out.println("Velocidade depois: " + carro.velocidadeAtual);
        carro.velocidadeAtual = 40;
        System.out.println("Antes de frear: " + carro.velocidadeAtual);
        carro.frear(20);
        System.out.println("Depois de frear: " + carro.velocidadeAtual);
    }
}
