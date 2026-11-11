package dominio;

public class Pessoa {
    public String nome;
    public int idade;
    public boolean isMaiorDeIdade(int idadeMinima){
        if(idade>=idadeMinima){
            return (true);
        }else{
            return (false);
        }
    }
}
