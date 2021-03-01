package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;

public class Exer02 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("B");
        lista.adiciona("B");
        lista.adiciona("B");
        lista.adiciona("B");
        lista.adiciona("B");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A")); //true
        System.out.println(lista.contem("B")); //true
        System.out.println(lista.contem("D")); //false

        System.out.println(lista.ultimoIndicedo("B"));;
        System.out.println(lista.ultimoIndicedo("D"));;

    }
}
