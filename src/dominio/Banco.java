package dominio;

public class Banco {
    public void transferir(ContaBancaria origem,ContaBancaria destino,double valor){
        if (origem.saldo>=valor){
            origem.saldo = origem.saldo - valor;
            destino.saldo=destino.saldo+valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
}
