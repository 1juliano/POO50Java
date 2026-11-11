package teste;

import dominio.Livro;

public class LivroTeste01 {
    static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        livro1.titulo = "Turma da Monica";
        livro1.autor = "Mauricio de Souza";
        livro1.numerosPaginas = 370;
        livro1.preco = 29.90;
        livro2.titulo = "Meu pequeno Principe";
        livro2.autor = "Antoine de Saint-Exupéry";
        livro2.numerosPaginas = 128;
        livro2.preco = 29.90;
        System.out.printf("""
                livro01:
                titulo:%s
                autor:%s
                numerosPaginas:%d
                preco:%.2f
                ------------------------
                livro2:
                titulo:%s
                autor:%s
                numerosPaginas:%d
                preco:%.2f
                """, livro1.titulo, livro1.autor, livro1.numerosPaginas, livro1.preco, livro2.titulo, livro2.autor, livro2.numerosPaginas, livro2.preco);
        String resultado = livro1.verificarTamanho(livro1.numerosPaginas);
        System.out.println(resultado);
        String resultado2 = livro2.verificarTamanho(livro2.numerosPaginas);
        System.out.println(resultado2);
    }
}
