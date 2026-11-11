package teste;

import dominio.Filme;

public class FilmeTeste01 {
    static void main(String[] args) {
        Filme filme = new Filme();
        filme.titulo="Homem Aranha";
        filme.genero="Ação";
        filme.duracaoMinutos=145;
        filme.classificacaoIndicativa=12;
        System.out.printf("""
                titulo:%s
                genero:%s
                duracaoMinutos:%d
                filme:+%d
                """,filme.titulo,filme.genero,filme.duracaoMinutos,filme.classificacaoIndicativa);
        boolean resultado= filme.isFilmeLongo(filme.duracaoMinutos);
        System.out.println(resultado);
    }
}
