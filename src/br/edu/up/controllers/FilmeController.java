package br.edu.up.controllers;

import br.edu.up.models.FileManager;
import br.edu.up.models.Filme;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe responsável pela gestão da classe filme.
 */
public class FilmeController {
    Scanner leitor = new Scanner(System.in);
    private String caminho = "/Users/gabriellourenco/Desktop/Trabalho Java/Sistema de Gerenciamento de Cinema/src/br/edu/up/arquivos/documento_filmes.txt";

    /**
     * Construtor Vázio
     */
    public FilmeController() {
    }

    public void criarCatalogo(){
        FileManager.criaArquivo(caminho);
    }

    /**
     * Método responsável por realizar o cadastro de um novo filme.
     */
    public void cadastrarNovoFilme() {
        System.out.println("\nDigite o código do filme: ");
        String codigoFilme = leitor.nextLine();
        System.out.println("Digite o nome do filme: ");
        String nomeFilme = leitor.nextLine();
        System.out.println("Digite o gênero do filme: ");
        String generoFilme = leitor.nextLine();
        System.out.println("Digite o data de estreia do filme: ");
        String dataEstreiaFilme = leitor.nextLine();
        System.out.println("Descreva a sinopse do filme: ");
        String sinopseFilme = leitor.nextLine();

        Filme novoFilme = new Filme(codigoFilme, nomeFilme, generoFilme, dataEstreiaFilme, sinopseFilme);

        FileManager.acrescentarTextoArquivo(caminho, novoFilme);
    }

    /**
     * Método responsável por imprimir o arraylist de filme.
     */
     public void getListaFilme(){
        ArrayList<String> listaFilmes = FileManager.retornaListaArquivo(caminho);
        System.out.println(listaFilmes);
        for (String linha : listaFilmes) {
            System.out.println(linha);
        }
    }

    /**
     * Método responsável por buscar no arquivo e imprimir no console.
     *
     * @param dadoBusca O dado do filme que deve ser encontrado no arquivo.
     */
    public void buscarFilme(String dadoBusca){
        ArrayList<String> listaFilmes = FileManager.retornaListaArquivo(caminho);
        for (String filme : listaFilmes) {
            if (filme.contains(dadoBusca)) {
                System.out.println("Filme encontrado: " + filme);
            }
        }
    }

    /**
     * Método responsável por buscar no arquivo e deletar o filme.
     *
     * @param dadoBusca O dado do filme que deve ser encontrado no arquivo.
     */
    public void deletarFilme(String dadoBusca){
        ArrayList<String> listaFilmes = FileManager.retornaListaArquivo(caminho);
        ArrayList<String> novaListaFilmes = new ArrayList<>();

        for (String filme : listaFilmes) {
            if (!filme.contains(dadoBusca)) {
                novaListaFilmes.add(filme);
            } else {
                System.out.println("Filme encontrado e removido: " + filme);
            }
        }

        listaFilmes.clear();
        listaFilmes.addAll(novaListaFilmes);

        FileManager.escreverListaArquivo(caminho,listaFilmes);
    }
}
