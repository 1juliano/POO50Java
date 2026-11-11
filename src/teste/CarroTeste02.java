
package teste;

import dominio.Carro2;
import dominio.CadastrarCarro2;
import dominio.ImpressoraCarro2;

public class CarroTeste02 {

    public static void main(String[] args) {

        Carro2 carro1 = new Carro2();
        Carro2 carro2 = new Carro2();

        CadastrarCarro2 cadastro = new CadastrarCarro2();
        ImpressoraCarro2 impressora = new ImpressoraCarro2();

        cadastro.cadastrar(carro1, "João", "Civic", 2022, 100);
        cadastro.cadastrar(carro2, "Pedro", "Corolla", 2024, 140);

        int limiteDaVia = 120;

        System.out.println("===== CARRO 1 =====");
        impressora.imprimir(carro1, limiteDaVia);

        System.out.println("===== CARRO 2 =====");
        impressora.imprimir(carro2, limiteDaVia);

    }
}
