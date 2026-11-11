package dominio;

public class Celular {
    public String marca;
    public String modelo;
    public int armazenamento;
    public double preco;
    public boolean isPremium(double preco){
        if (preco>=400){
            return (true);
        }else{
            return(false);
        }
    }
}
