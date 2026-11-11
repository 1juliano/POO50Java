package dominio;

public class Termometro {
    public int temparaturaAtual;
    public boolean passouDoLimite(double temperaturaLimite){
        return temparaturaAtual>temperaturaLimite;
    }
}
