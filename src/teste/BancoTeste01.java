package teste;

import dominio.Banco;
import dominio.ContaBancaria;

public class BancoTeste01 {
    static void main(String[] args) {
        Banco banco = new Banco();
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        conta1.saldo=1000;
        conta2.saldo=500;
       banco.transferir(conta1,conta2,300);
        System.out.println(conta1.saldo);
        System.out.println(conta2.saldo);
    }
}
