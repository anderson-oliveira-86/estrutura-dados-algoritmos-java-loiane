package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {

        // criação das variáveis
        Scanner scanner = new Scanner(System.in);

        // criar o vetor com 20 de capacidade
        Lista<Contato> contatos = new Lista<Contato>(20);

        // criar e adicionar 30 contatos
        criarContatosDinamicamente(5, contatos);

        // criar um menu para que o usuário escolha as opções
        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(scanner);

            switch (opcao) {
                case 1:
                    adicionarContatoFinal(scanner, contatos);
                    break;
                case 2:
                    adicionarContatoPosicao(scanner, contatos);
                    break;
                case 3:
                    obtemContatoPosicao(scanner, contatos);
                    break;
                case 4:
                    obtemContato(scanner, contatos);
                    break;
                case 5:
                    pesquisarUltimoIndice(scanner, contatos);
                    break;
                case 6:
                    pesquisarContatoExiste(scanner, contatos);
                    break;
                case 7:
                    excluirPosPosicao(scanner , contatos);
                    break;
                case 8:
                    excluirContato(scanner , contatos);
                    break;
                case 9:
                    imprimeTamanhoVetor(contatos);
                    break;
                case 10:
                    limparVetor(contatos);
                    break;
                case 11:
                    imprimirVetor(contatos);
                    break;

            }
        }
        System.out.println("Usuario digitou zero, saindo do programa.");
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista){
        System.out.println("Tamanho do vetor é de: " + lista.tamanho());
    }

    private static void limparVetor(Lista<Contato> lista){
        lista.limpar();
        System.out.println("Todos os contatos do vetor foram excluidos");
    }
    private static void imprimirVetor(Lista<Contato> lista){
        System.out.println(lista);
    }

    private static void obtemContato(Scanner scanner, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", scanner);
        try {
            Contato contato = lista.obtem(pos);

            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado: ");
            pos = lista.busca(contato);
            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scanner, Lista<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", scanner);

        try {
            Contato contato = lista.obtem(pos);

            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último indice do contato encontrado: ");
            pos = lista.ultimoIndicedo(contato);
            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPosPosicao(Scanner scanner, Lista<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posicao a ser removida", scanner);

        try {
            Contato contato = lista.obtem(pos);
            lista.remove(contato);

            System.out.println("contato excluído!");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirContato(Scanner scanner, Lista<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posicao a ser removida", scanner);

        try {
            lista.remove(pos);
            System.out.println("contato excluído!");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scanner, Lista<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", scanner);

        try {
            Contato contato = lista.obtem(pos);

            boolean existe = lista.contem(contato);

            if (existe) {
                System.out.println("Contato existe, seguem os dados: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }


    private static void obtemContatoPosicao(Scanner scanner, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", scanner);
        try {
            Contato contato = lista.obtem(pos);

            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    protected static int obterOpcaoMenu(Scanner scanner) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada = null;

        while (!entradaValida) {
            System.out.println("Menu de opções");
            System.out.println(" 1: Adiciona contato no final do vetor");
            System.out.println(" 2: Adiciona contato em uma posição especifica");
            System.out.println(" 3: Obtém contato de uma posição específica");
            System.out.println(" 4: Consulta contato");
            System.out.println(" 5: Consulta último indice do contato");
            System.out.println(" 6: Verifica se o contato já existe");
            System.out.println(" 7: Excluir por posição");
            System.out.println(" 8: Excluir contato");
            System.out.println(" 9: Verifica o tamanho do vetor");
            System.out.println("10: Excluir todos os contatos do vetor");
            System.out.println("11: Imprime Vetor");
            System.out.println(" 0: Sair");

            System.out.print("Digite a opção desejada: ");
            try {
                entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente!\n\n");
            }

        }

        return opcao;
    }

    private static void adicionarContatoFinal(Scanner scanner, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformação("Entre com o nome: ", scanner);
        String telefone = leInformação("Entre com o telefone: ", scanner);
        String email = leInformação("Entre com o email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);
        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!\n");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scanner, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformação("Entre com o nome: ", scanner);
        String telefone = leInformação("Entre com o telefone: ", scanner);
        String email = leInformação("Entre com o email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);
        int pos = leInformacaoInt("Entre com a posicao a adicionar o contato", scanner);

        try {
            lista.adiciona(pos , contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    protected static String leInformação(String msg, Scanner scanner) {
        System.out.println(msg);
        String entrada = scanner.nextLine();
        return entrada;
    }

    protected static int leInformacaoInt(String msg, Scanner scanner) {
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = scanner.nextLine();
                num = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente");
            }
        }

        return num;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        Contato contato;
        for (int i = 0; i <= quantidade; i++) {

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111-111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adiciona(contato);
        }
    }
}
