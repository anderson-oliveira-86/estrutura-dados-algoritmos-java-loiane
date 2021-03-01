package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.teste.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer07 extends Exer06{
    public static void main(String[] args) {

        // criação das variáveis
        Scanner scanner = new Scanner(System.in);

        // criar o vetor com 20 de capacidade
        ArrayList<Contato> contatos = new ArrayList<Contato>(20);

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

    private static void imprimeTamanhoVetor(ArrayList<Contato> arrayList){
        System.out.println("Tamanho do vetor é de: " + arrayList.size());
    }

    private static void limparVetor(ArrayList<Contato> arrayList){
        arrayList.clear();
        System.out.println("Todos os contatos do vetor foram excluidos");
    }
    private static void imprimirVetor(ArrayList<Contato> arrayList){
        System.out.println(arrayList);
    }

    private static void obtemContato(Scanner scanner, ArrayList<Contato> arrayList) {
        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", scanner);
        try {
            Contato contato = arrayList.get(pos);

            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado: ");
            pos = arrayList.indexOf(contato);
            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scanner, ArrayList<Contato> arrayList) {

        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", scanner);

        try {
            Contato contato = arrayList.get(pos);

            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último indice do contato encontrado: ");
            pos = arrayList.lastIndexOf(contato);
            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPosPosicao(Scanner scanner, ArrayList<Contato> arrayList) {

        int pos = leInformacaoInt("Entre com a posicao a ser removida", scanner);

        try {
            Contato contato = arrayList.get(pos);
            arrayList.remove(contato);

            System.out.println("contato excluído!");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirContato(Scanner scanner, ArrayList<Contato> arrayList) {

        int pos = leInformacaoInt("Entre com a posicao a ser removida", scanner);

        try {
            arrayList.remove(pos);
            System.out.println("contato excluído!");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scanner, ArrayList<Contato> arrayList) {

        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", scanner);

        try {
            Contato contato = arrayList.get(pos);

            boolean existe = arrayList.contains(contato);

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


    private static void obtemContatoPosicao(Scanner scanner, ArrayList<Contato> arrayList) {
        int pos = leInformacaoInt("Entre com a posicao a ser pesquisada", scanner);
        try {
            Contato contato = arrayList.get(pos);

            System.out.println("Contato existe, seguem os dados: ");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionarContatoFinal(Scanner scanner, ArrayList<Contato> arrayList) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformação("Entre com o nome: ", scanner);
        String telefone = leInformação("Entre com o telefone: ", scanner);
        String email = leInformação("Entre com o email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);
        arrayList.add(contato);

        System.out.println("Contato adicionado com sucesso!\n");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scanner, ArrayList<Contato> arrayList) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = leInformação("Entre com o nome: ", scanner);
        String telefone = leInformação("Entre com o telefone: ", scanner);
        String email = leInformação("Entre com o email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);
        int pos = leInformacaoInt("Entre com a posicao a adicionar o contato", scanner);

        try {
            arrayList.add(pos , contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");
        }
    }


    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> arrayList) {
        Contato contato;
        for (int i = 0; i <= quantidade; i++) {

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111-111" + i);
            contato.setEmail("contato" + i + "@email.com");

            arrayList.add(contato);
        }
    }
}
