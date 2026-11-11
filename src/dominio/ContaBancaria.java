package dominio;

public class ContaBancaria {
    public String titular;
    public int numeroConta;
    public double saldo;

    public boolean temSaldo(double saldo) {
        if (saldo >= 0) {
            return (true);
        } else {
            return (false);
        }
    }
    public boolean podeSacar(double valorSaque){
        if(valorSaque<=saldo){
            return (true);
        }else{
            return (false);
        }
    }
    public void depositar(double valor) {
        saldo = saldo + valor;
    }
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}

