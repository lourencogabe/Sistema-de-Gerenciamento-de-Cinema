package br.edu.up.models;

import java.io.*;
import java.io.File;
import java.util.Scanner;

public class FileManager {
    String caminho = "/Sistema de Gerenciamento de Cinema/src/br/edu/up/arquivos";
    File diretorio = new File(caminho + "Teste");
    File arquivo = new File(diretorio, "ingresso.txt");

    /**
     * Método responsável por ler o arquivo e retornar em uma String.
     *
     * @param caminhoArquivo caminho do arquivo para leitura.
     * @return String contendo o conteúdo do arquivo ou uma String vazia se ocorrer um erro.
     */
    public static String lerTextoArquivo(String caminhoArquivo) {
        try {
            File arquivo = new File(caminhoArquivo);
            Scanner leitorArquivo = new Scanner(arquivo);
            StringBuilder conteudoArquivo = new StringBuilder();
            String linha;

            while (leitorArquivo.hasNext()) {
                linha = leitorArquivo.nextLine();
                conteudoArquivo.append(linha).append("\n");
            }
            return conteudoArquivo.toString();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo " + caminhoArquivo + " - " + e.getMessage());
            return "";
        }
    }

    /**
     * Método responsável pela escrita no arquivo.
     *
     * @param caminhoArquivo caminho do arquivo para leitura.
     * @param conteudo conteúdo do arquivo para escrita.
     */
    public static void escreverTextoArquivo(String caminhoArquivo, String conteudo) {
        try {
            FileWriter escritor = new FileWriter(caminhoArquivo);
            escritor.write(conteudo);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + caminhoArquivo + " - " + e.getMessage());
        }
    }

    /**
     * Método responsável pela escrita no arquivo.
     *
     * @param caminhoArquivo caminho do arquivo para leitura.
     * @param conteudo conteúdo do arquivo para escrita.
     */
    public static void acrescentarTextoArquivo(String caminhoArquivo, String conteudo) {
        try {
            FileWriter escritor = new FileWriter(caminhoArquivo, true);
            escritor.write(conteudo);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + caminhoArquivo + " - " + e.getMessage());
        }
    }

    /**
     * Verifica se o arquivo existe.
     *
     * @param caminhoArquivo caminho do arquivo.
     * @return retorna verdadeiro se existir e falso se negativo.
     */
    public static boolean arquivoExiste(String caminhoArquivo) {
        File arquivo = new File(caminhoArquivo);
        return arquivo.exists();
    }

    /**
     * Cria arquivo se não existir.
     *
     * @param caminhoArquivo caminho do arquivo.
     * @return cria arquivo se não existir
     */
    public static boolean criaArquivo(String caminhoArquivo) {
        try {
            File arquivo = new File(caminhoArquivo);
            return arquivo.createNewFile();
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + caminhoArquivo + " - " + e.getMessage());
            return false;
        }
    }

    /**
     * Apaga arquivo.
     *
     * @param caminhoArquivo caminho do arquivo.
     * @return Verdadeiro se o arquivo for deletado ou falso se o arquivo não existir.
     */
    public static boolean apagaArquivo(String caminhoArquivo) {
        File arquivo = new File(caminhoArquivo);
        return arquivo.exists() && arquivo.delete();
    }
}