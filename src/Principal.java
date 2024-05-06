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
                filme.deletarFilme("codigoFilme = 1");
            }
        } while (opcaoPrincipal != 0);
    }
}