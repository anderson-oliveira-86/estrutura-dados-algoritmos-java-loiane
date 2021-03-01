package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

import java.util.Stack;

public class Exer04 {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();

        int tamanho = 4;

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());
        System.out.println("Empilhando livros na pilha:");

        for (int i = 0; i < tamanho; i++) {
            Livro livro = new Livro();
            livro.setNome("Livro " + i);
            livro.setAutor("Autor " + i);
            livro.setAnoLancamento(2016 + i);
            livro.setIsbn("ISBN " + i);

            pilha.push(livro);
        }

        System.out.println(pilha.size() + " livros foram empilhados");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());

        System.out.println("Espiando o topo da pilha: " + pilha.peek());

        System.out.println("Desempilhando livros da pilha: ");
        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando livro " + pilha.pop());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.isEmpty());

    }
}
