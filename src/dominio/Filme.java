package dominio;

public class Filme {
    public String titulo;
    public String genero;
    public int duracaoMinutos;
    public int classificacaoIndicativa;
    public boolean isFilmeLongo(double duracaoMimutos){
        if(duracaoMimutos>=120){
            return (true);
        }else{
            return(false);
        }
    }
}
