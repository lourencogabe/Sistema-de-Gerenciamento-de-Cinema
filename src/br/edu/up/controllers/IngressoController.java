package br.edu.up.controllers;

import br.edu.up.models.FileManager;
import br.edu.up.models.Ingresso;
import br.edu.up.models.Sessao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Menu Sessão.
 */
public class IngressoController {
    Scanner leitor = new Scanner(System.in);
    FilmeController filme = new FilmeController();
    ClienteController cliente = new ClienteController();
    private String caminho = "/Users/gabriellourenco/Desktop/Trabalho Java/Sistema de Gerenciamento de Cinema/src/br/edu/up/arquivos/ingresso.txt";

    public IngressoController(){
    }

    /**
     * Menu Sessão.
     */
    public void criarArquivoIngresso(){
        FileManager.criaArquivo(caminho);
    }

    public void venderNovoIngresso() {
        ArrayList<String> ingresso = new ArrayList<>();

        System.out.println("Informe o documento do cliente: ");
        String dadoCliente = leitor.nextLine();
        System.out.println("Informe o código do filme: ");
        String dadoFilme = leitor.nextLine();
        System.out.println("informe a data de emissão do ingresso: ");
        String dataEmissaoIngresso = leitor.nextLine();
        System.out.println("Informe o código do ingresso: ");
        int codigoIngresso = leitor.nextInt();
        System.out.println("Digite o valor do ingresso: ");
        float ingressoValor = leitor.nextFloat();

        Ingresso ingressoObjeto = new Ingresso(codigoIngresso,ingressoValor,dataEmissaoIngresso);

        ingresso.add(cliente.buscarCliente("documentoCliente="+dadoCliente));
        ingresso.add(filme.buscarFilme("codigoFilme="+dadoFilme));
        ingresso.add(ingressoObjeto.toString());

        criarArquivoIngresso();

        FileManager.escreverListaArquivo(caminho,ingresso);
    }
}
