import br.edu.up.controllers.FilmeController;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        FilmeController filme = new FilmeController();

        int opcaoPrincipal;

        do {
            System.out.print("##-----------CINEMA ADMIN-----------##\n");
            System.out.print("|------------------------------------|\n");
            System.out.print("| Opção 1 - Vender ingresso \n");
            System.out.print("| Opção 2 - Gerenciar Filmes \n");
            System.out.print("| Opção 3 - Gerenciar Sessão  \n");
            System.out.print("| Opção 4 - Gerenciar Clientes \n");
            System.out.print("|------------------------------------|\n");
            System.out.print("| Opção: \n");
            opcaoPrincipal = leitor.nextInt();

            if (opcaoPrincipal == 2) {
                int opcaoFilme;
                String dadoFilme = "";

                do {
                    System.out.print("|--------------FILME-----------------|\n");
                    System.out.print("| Opção 1 - Cadastrar Filme \n");
                    System.out.print("| Opção 2 - Buscar Filme \n");
                    System.out.print("| Opção 3 - Deletar Filme \n");
                    System.out.print("| Opção 4 - Ver lista de filmes \n");
                    System.out.print("| Opção 5 - Criar catalogo \n");
                    System.out.print("|------------------------------------|\n");
                    System.out.print("| Opção: \n");
                    opcaoFilme = leitor.nextInt();

                    switch (opcaoFilme) {
                        case 1:
                            filme.cadastrarNovoFilme();
                            break;
                        case 2:
                            System.out.println("Informe o código do filme: ");
                            dadoFilme = leitor.nextLine();
                            filme.buscarFilme("codigo=" + dadoFilme);
                            break;
                        case 3:
                            System.out.println("Informe o código do filme: ");
                            dadoFilme = leitor.nextLine();
                            filme.deletarFilme("codigo=" + dadoFilme);
                            break;
                        case 4:
                            filme.getListaFilme();
                            break;
                        case 5:
                            filme.criarCatalogo();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                }while (opcaoFilme != 0);
            }
        } while (opcaoPrincipal != 0);
    }
}