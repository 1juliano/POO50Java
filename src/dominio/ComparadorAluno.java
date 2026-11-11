package dominio;

public class ComparadorAluno {
    public Aluno retornarAlunoComMaiorMedia(Aluno aluno1,Aluno aluno2){
        if (aluno1.media>aluno2.media)
            return aluno1;
        else {
            return aluno2;
        }
    }
}
