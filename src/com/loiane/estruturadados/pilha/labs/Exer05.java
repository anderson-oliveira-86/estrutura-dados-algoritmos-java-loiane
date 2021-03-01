package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class Exer05 {
    public static void main(String[] args) {

        imprimeResultado("ADA");
        imprimeResultado("ABCD");
        imprimeResultado("ABCCBA");
        imprimeResultado("Maria");
        imprimeResultado("Maria");
    }

    public static void imprimeResultado(String palavra){
        System.out.println(palavra + "é palindromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra){

        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.estaVazia()){
            palavraInversa += pilha.desempilha();
        }

        if(palavra.equalsIgnoreCase(palavraInversa)){
            return true;
        }
        return false;
    }
}
