package dominio;

public class Livro {
    public String titulo;
    public String autor;
    public int numerosPaginas;
    public double preco;
    public String verificarTamanho(int numerosPaginas){
        if(numerosPaginas>=300){
            return ("Livro grande");
        }else{
            return ("Livro pequeno");
        }
    }
}
