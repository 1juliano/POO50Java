package dominio;

public class Carro {
     public String nome;
     public String modelo;
     public int ano;
     public int velocidadeAtual;
    public String verificarIdadeCarro(int ano){
        if(ano>=2010){
            return ("carro novo");
        }else{
            return ("carro antigo");
        }
    }
    public boolean isMultado(int limiteDaVia){
        if(velocidadeAtual>limiteDaVia){
            return (true);
        }else{
            return (false);
        }
    }
    public String gerarMensagemMulta(int limiteDaVia){
        if (velocidadeAtual>limiteDaVia){
            return ("Passsou do limite da via");
        }else{
            return("Nao passou do limite da via");
        }
    }
    public void imprimirMulta(int limiteDaVia){
        if(velocidadeAtual>limiteDaVia){
            System.out.println("vc tem uma multa pra pagar");
        }else{
            System.out.println("zero multas");
        }

    }
    public void acelerar(double valor) {
        velocidadeAtual += valor;
    }
    public void frear(double valor) {
        velocidadeAtual -= valor;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }
}
