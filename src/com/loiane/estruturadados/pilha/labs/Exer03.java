package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>();

        int tamanho = 4;

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
        System.out.println("Empilhando livros na pilha:");

        for (int i = 0; i < tamanho; i++) {
            Livro livro = new Livro();
            livro.setNome("Livro " + i);
            livro.setAutor("Autor " + i);
            livro.setAnoLancamento(2016 + i);
            livro.setIsbn("ISBN " + i);

            pilha.empilha(livro);
        }

        System.out.println(pilha.tamanho() + " livros foram empilhados");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());

        System.out.println("Espiando o topo da pilha: " + pilha.topo());

        System.out.println("Desempilhando livros da pilha: ");
        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando livro " + pilha.desempilha());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());

    }
}
