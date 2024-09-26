package main.java.list.operacoesbasicas.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, Integer anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()) {

            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }

        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(Integer anoInicial, Integer anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();

        if (!livroList.isEmpty()) {

            for (Livro livro : livroList) {
                if ((livro.getAnoPublicacao() >= anoInicial) && (livro.getAnoPublicacao() <= anoFinal)) {
                    livrosPorIntervalo.add(livro);
                }
            }

        }

        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosEncontrato = null;

        if (!livroList.isEmpty()) {

            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosEncontrato = livro;
                    break;
                }
            }

        }

        return livrosEncontrato;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println("Pesquisando por Autor 2");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));


        System.out.println("");
        System.out.println("Pesquisando por intervalo de anos de 2020 a 2021");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));

        System.out.println("");
        System.out.println("Pesquisando por titulo Livro 1 (o primeiro que encontrar)");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }
}
