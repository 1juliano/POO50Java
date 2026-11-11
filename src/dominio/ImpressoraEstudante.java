package dominio;

public class ImpressoraEstudante {
    public void imprimeEstudante(Estudante estudante){
        System.out.printf("""
                nome:%s
                idade:%d
                sexo:%s
                """,estudante.nome,estudante.idade,estudante.sexo);
    }
}
