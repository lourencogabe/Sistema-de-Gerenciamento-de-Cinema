package br.edu.up.models;

import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe responsável pela gestão dos arquivos.
 */
public class FileManager {

    /**
     * Método responsável por ler o arquivo e retornar em uma String.
     *
     * @param caminhoArquivo caminho do arquivo para leitura.
     * @return String contendo o conteúdo do arquivo ou uma String vazia se ocorrer um erro.
     */
    public static ArrayList<String> retornaListaArquivo(String caminhoArquivo) {
        ArrayList<String> listaArquivo = new ArrayList<>();
        try {
            File arquivo = new File(caminhoArquivo);
            Scanner leitorArquivo = new Scanner(arquivo);

            while (leitorArquivo.hasNextLine()) {
                String linha = leitorArquivo.nextLine();
                listaArquivo.add(linha);
            }
            leitorArquivo.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo " + caminhoArquivo + " - " + e.getMessage());
        }
            return listaArquivo;
    }

    /**
     * Método responsável pela escrita de arraylist no arquivo.
     *
     * @param caminhoArquivo caminho do arquivo para leitura.
     * @param lista conteúdo do arquivo para escrita.
     */
    public static void escreverListaArquivo(String caminhoArquivo, ArrayList<String> lista) {
        try {
            FileWriter leitor = new FileWriter(caminhoArquivo);
            for (String item : lista) {
                leitor.write(item + "\n");
            }
            leitor.close();
            System.out.println("ArrayList gravado com sucesso no arquivo.");
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
    public static void acrescentarTextoArquivo(String caminhoArquivo, Object conteudo) {
        try {
            String conteudoString = conteudo.toString();
            FileWriter escritor = new FileWriter(caminhoArquivo, true);
            escritor.write(conteudoString + "\n");
            escritor.close();
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