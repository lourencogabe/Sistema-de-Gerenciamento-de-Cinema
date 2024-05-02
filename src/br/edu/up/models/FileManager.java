package br.edu.up.models;

import java.io.File;

public class FileManager {
    String caminho ="/Sistema de Gerenciamento de Cinema/src/br/edu/up/arquivos";
    File diretorio = new File(caminho + "Teste");
    File arquivo = new File(diretorio, "ingresso.txt");
}