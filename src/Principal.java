import br.edu.up.controllers.ClienteController;
import br.edu.up.controllers.FilmeController;
import br.edu.up.controllers.IngressoController;
import br.edu.up.controllers.SessaoController;

import java.util.Scanner;

/**
 * Classe principal da aplicação.
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        FilmeController filme = new FilmeController();
        ClienteController cliente = new ClienteController();
        IngressoController ingresso = new IngressoController();
        SessaoController sessao = new SessaoController();

        int opcaoPrincipal;

        /**
         * Menu principal.
         */
        do {
            System.out.print("##-----------CINEMA ADMIN-----------##\n");
            System.out.print("|------------------------------------|\n");
            System.out.print("| Opção 1 - Gerenciar Filmes \n");
            System.out.print("| Opção 2 - Gerenciar Clientes\n");
            System.out.print("| Opção 3 - Gerenciar Sessão  \n");
            System.out.print("| Opção 4 - Vender Ingresso \n");
            System.out.print("|------------------------------------|\n");
            System.out.print("| Opção: \n");
            opcaoPrincipal = leitor.nextInt();

            /**
             * Menu Filme.
             */
            if (opcaoPrincipal == 1) {
                int opcaoFilme;
                String dadoFilme;

                do {
                    System.out.print("|--------------FILME-----------------|\n");
                    System.out.print("| Opção 1 - Cadastrar Filme \n");
                    System.out.print("| Opção 2 - Buscar Filme \n");
                    System.out.print("| Opção 3 - Deletar Filme \n");
                    System.out.print("| Opção 4 - Ver lista de filmes \n");
                    System.out.print("| Opção 5 - Criar catalogo \n");
                    System.out.print("| Opção 0 - Menu Principal \n");
                    System.out.print("|------------------------------------|\n");
                    System.out.print("| Opção: \n");
                    opcaoFilme = leitor.nextInt();

                    leitor.nextLine();

                    switch (opcaoFilme) {
                        case 1:
                            filme.cadastrarNovoFilme();
                            break;
                        case 2:
                            System.out.println("Informe o código do filme:");
                            dadoFilme = leitor.nextLine();
                            System.out.println(filme.buscarFilme("codigoFilme=" + dadoFilme));
                            break;
                        case 3:
                            System.out.println("Informe o código do filme:");
                            dadoFilme = leitor.nextLine();
                            filme.deletarFilme("codigoFilme=" + dadoFilme);
                            break;
                        case 4:
                            filme.getListaFilme();
                            break;
                        case 5:
                            filme.criarCatalogo();
                            break;
                        default:
                            System.out.println("\n<- Voltando ao menu principal");
                            break;
                    }
                }while (opcaoFilme != 0);
            }

            /**
             * Menu Cliente.
             */
            if (opcaoPrincipal == 2) {
                int opcaoCliente;
                String dadoCliente;

                do {
                    System.out.print("|-------------CLIENTE---------------|\n");
                    System.out.print("| Opção 1 - Cadastrar Cliente \n");
                    System.out.print("| Opção 2 - Buscar Cliente \n");
                    System.out.print("| Opção 3 - Deletar Cliente \n");
                    System.out.print("| Opção 4 - Ver lista de Cliente \n");
                    System.out.print("| Opção 5 - Criar Base de Clientes \n");
                    System.out.print("| Opção 0 - Menu Principal \n");
                    System.out.print("|------------------------------------|\n");
                    System.out.print("| Opção: \n");
                    opcaoCliente = leitor.nextInt();

                    leitor.nextLine();

                    switch (opcaoCliente) {
                        case 1:
                            cliente.cadastrarNovoCliente();
                            break;
                        case 2:
                            System.out.println("Informe o documento do cliente:");
                            dadoCliente = leitor.nextLine();
                            System.out.println(cliente.buscarCliente("codigoFilme=" + dadoCliente));
                            break;
                        case 3:
                            System.out.println("Informe o documento do cliente:");
                            dadoCliente = leitor.nextLine();
                            cliente.deletarCliente("codigoFilme=" + dadoCliente);
                            break;
                        case 4:
                            cliente.getListaCliente();
                            break;
                        case 5:
                            cliente.criarListaCliente();
                            break;
                        default:
                            System.out.println("\n<- Salvando e retornando ao menu principal");
                            break;
                    }
                }while (opcaoCliente != 0);
            }

            /**
             * Menu Sessão.
             */
            if (opcaoPrincipal == 3) {
                int opcaoSessao;
                String dadoSessao;

                do {
                    System.out.print("|--------------SESSÃO-----------------|\n");
                    System.out.print("| Opção 1 - Cadastrar Sessão \n");
                    System.out.print("| Opção 2 - Buscar Sessão \n");
                    System.out.print("| Opção 3 - Deletar Sessão \n");
                    System.out.print("| Opção 4 - Ver Calendário de Sessões \n");
                    System.out.print("| Opção 5 - Criar Calendário \n");
                    System.out.print("| Opção 0 - Menu Principal \n");
                    System.out.print("|------------------------------------|\n");
                    System.out.print("| Opção: \n");
                    opcaoSessao = leitor.nextInt();

                    leitor.nextLine();

                    switch (opcaoSessao) {
                        case 1:
                            sessao.cadastrarNovaSessao();
                            break;
                        case 2:
                            System.out.println("Informe o código da sessão:");
                            dadoSessao = leitor.nextLine();
                            sessao.buscarSessao("codigoSessao=" + dadoSessao);
                            break;
                        case 3:
                            System.out.println("Informe o código da sessão::");
                            dadoSessao = leitor.nextLine();
                            sessao.deletarSessao("codigoSessao=" + dadoSessao);
                            break;
                        case 4:
                            sessao.getListaSessao();
                            break;
                        case 5:
                            sessao.criarCalendarioSessao();
                            break;
                        default:
                            System.out.println("\n<- Salvando e retornando ao menu principal");
                            break;
                    }
                }while (opcaoSessao != 0);
            }

            /**
             * Menu Ingresso.
             */
            if (opcaoPrincipal == 4) {
                int opcaoIngresso;

                do {
                    System.out.print("|-------------Ingresso---------------|\n");
                    System.out.print("| Opção 1 - Vender Ingresso \n");
                    System.out.print("| Opção 0 - Menu Principal \n");
                    System.out.print("|------------------------------------|\n");
                    System.out.print("| Opção: \n");
                    opcaoIngresso = leitor.nextInt();

                    switch (opcaoIngresso) {
                        case 1:
                            ingresso.venderNovoIngresso();
                            break;
                        default:
                            System.out.println("\n<- Salvando e voltando ao menu principal!");
                            break;
                    }
                }while (opcaoIngresso != 0);
            }
        } while (opcaoPrincipal != 0);
    }
}