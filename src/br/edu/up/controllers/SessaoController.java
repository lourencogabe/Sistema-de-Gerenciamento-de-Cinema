package br.edu.up.controllers;

import br.edu.up.models.FileManager;
import br.edu.up.models.Sessao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe responsável pela gestão da classe Sessao.
 */
public class SessaoController {
    Scanner leitor = new Scanner(System.in);
    private String caminho = "/Users/gabriellourenco/Desktop/Trabalho Java/Sistema de Gerenciamento de Cinema/src/br/edu/up/arquivos/calendario_sessoes.txt";

    /**
     * Construtor Vázio
     */
    public SessaoController() {
    }

    /**
     * Método responsável por criar o arquivo de sessões.
     */
    public void criarCalendarioSessao(){
        FileManager.criaArquivo(caminho);
    }

    /**
     * Método responsável por realizar o cadastro de uma novo sessão.
     */
    public void cadastrarNovaSessao() {
        System.out.println("Informe a data da sessão: ");
        String dataSessao = leitor.nextLine();
        System.out.println("Digite o codigo da sessão: ");
        int codigoSessao = leitor.nextInt();
        System.out.println("Digite a quantidade de lugares na sessão: ");
        int quantidadeLugaresSessao = leitor.nextInt();

        leitor.nextLine();

        Sessao sessao = new Sessao(codigoSessao,quantidadeLugaresSessao,dataSessao);

        FileManager.acrescentarTextoArquivo(caminho, sessao);
    }

    /**
     * Método responsável por imprimir o arraylist da sessão.
     */
    public void getListaSessao(){
        ArrayList<String> listaSessao = FileManager.retornaListaArquivo(caminho);
        for (String linha : listaSessao) {
            System.out.println(linha + "\n");
        }
    }

    /**
     * Método responsável por buscar no arquivo e imprimir no console.
     *
     * @param dadoBusca O dado da sessão que deve ser encontrado no arquivo.
     */
    public void buscarSessao(String dadoBusca){
        ArrayList<String> listaSessao = FileManager.retornaListaArquivo(caminho);
        for (String sessao : listaSessao) {
            if (sessao.contains(dadoBusca)) {
                System.out.println("Sessão encontrada: " + sessao);
            }
        }
    }

    /**
     * Método responsável por buscar no arquivo e deletar a sessão.
     *
     * @param dadoBusca O dado da sessão que deve ser encontrado no arquivo.
     */
    public void deletarSessao(String dadoBusca){
        ArrayList<String> listaSessao = FileManager.retornaListaArquivo(caminho);
        ArrayList<String> novaListaSessao = new ArrayList<>();

        for (String sessao : listaSessao) {
            if (!sessao.contains(dadoBusca)) {
                novaListaSessao.add(sessao);
            } else {
                System.out.println("Sessão encontrado e removido: " + sessao);
            }
        }

        listaSessao.clear();
        listaSessao.addAll(novaListaSessao);

        FileManager.escreverListaArquivo(caminho,listaSessao);
    }
}
