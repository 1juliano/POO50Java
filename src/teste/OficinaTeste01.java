package teste;

import dominio.Carro;
import dominio.Oficina;

public class OficinaTeste01 {
    static void main(String[] args) {
        Oficina oficina = new Oficina();
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        carro.velocidadeAtual=80;
        carro2.velocidadeAtual=120;
        oficina.trocarVelocidades(carro,carro2);
        System.out.println("Carro 1: " + carro.velocidadeAtual);
        System.out.println("Carro 2: " + carro2.velocidadeAtual);
    }
}
