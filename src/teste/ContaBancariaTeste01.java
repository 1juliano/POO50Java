package teste;

import dominio.ContaBancaria;

public class ContaBancariaTeste01 {
    static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.titular="Juliano";
        contaBancaria.numeroConta=123456789;
        contaBancaria.saldo=5500;
        System.out.printf("""
                titular=%s
                numeroConta=%d
                saldo=%.2f
                """,contaBancaria.titular,contaBancaria.numeroConta,contaBancaria.saldo);
         boolean resultado=contaBancaria.temSaldo(contaBancaria.saldo);
        System.out.println(resultado);
        boolean saque= contaBancaria.podeSacar(200);
        System.out.println(saque);
        contaBancaria.saldo = 100;

        System.out.println("Saldo antes: " + contaBancaria.saldo);

        contaBancaria.depositar(50);

        System.out.println("Saldo depois: " + contaBancaria.saldo);
        contaBancaria.saldo = 100;

        System.out.println("Saldo antes: " + contaBancaria.saldo);

        contaBancaria.sacar(30);

        System.out.println("Saldo depois: " + contaBancaria.saldo);
    }
}
