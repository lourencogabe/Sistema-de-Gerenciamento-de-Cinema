package br.edu.up.controllers;

import br.edu.up.models.Cliente;
import br.edu.up.models.FileManager;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteController {
    Scanner leitor = new Scanner(System.in);
    private String caminho = "/Users/gabriellourenco/Desktop/Trabalho Java/Sistema de Gerenciamento de Cinema/src/br/edu/up/arquivos/base_cliente.txt";

    /**
     * Construtor Vázio
     */
    public ClienteController() {
    }

    public void criarListaCliente(){
        FileManager.criaArquivo(caminho);
    }

    /**
     * Método responsável por realizar o cadastro de um novo Cliente.
     */
    public void cadastrarNovoCliente() {
        System.out.println("\nDigite o nome do cliente: ");
        String nomeCliente = leitor.nextLine();
        System.out.println("Digite o documento do cliente: ");
        String documentoCliente = leitor.nextLine();
        System.out.println("Informe o contato do cliente: ");
        String contatoCliente = leitor.nextLine();
        System.out.println("Para finalizar, Digite a idade do cliente: ");
        int idadeCliente = leitor.nextInt();


        Cliente cliente = new Cliente(nomeCliente,documentoCliente,idadeCliente,contatoCliente);

        FileManager.acrescentarTextoArquivo(caminho, cliente);
    }

    /**
     * Método responsável por imprimir o arraylist de cliente.
     */
    public void getListaCliente(){
        ArrayList<String> listaCliente = FileManager.retornaListaArquivo(caminho);
        for (String linha : listaCliente) {
            System.out.println(linha + "\n");
        }
    }

    /**
     * Método responsável por buscar no arquivo e imprimir no console.
     *
     * @param dadoBusca O dado do cliente que deve ser encontrado no arquivo.
     */
    public String buscarCliente(String dadoBusca){
        ArrayList<String> listaCliente = FileManager.retornaListaArquivo(caminho);
        for (String cliente : listaCliente) {
            if (cliente.contains(dadoBusca)) {
                 return cliente;
            }
        }
        return "Cliente não encontrado.";
    }

    /**
     * Método responsável por buscar no arquivo e deletar o cliente.
     *
     * @param dadoBusca O dado do cliente que deve ser encontrado no arquivo.
     */
    public void deletarCliente(String dadoBusca){
        ArrayList<String> listaCliente = FileManager.retornaListaArquivo(caminho);
        ArrayList<String> novaListaCliente = new ArrayList<>();

        for (String cliente : listaCliente) {
            if (!cliente.contains(dadoBusca)) {
                novaListaCliente.add(cliente);
            } else {
                System.out.println("Cliente encontrado e removido: " + cliente);
            }
        }

        listaCliente.clear();
        listaCliente.addAll(novaListaCliente);

        FileManager.escreverListaArquivo(caminho,listaCliente);
    }
}
