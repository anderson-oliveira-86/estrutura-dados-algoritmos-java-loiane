package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista;

public class Aula12 {
    public static void main(String[] args) {

        Contato c1 = new Contato("Contato 1" , "1234-4567" , "contato1@email.com");
        Contato c2 = new Contato("Contato 2" , "2345-6789" , "contato2@email.com");
        Contato c3 = new Contato("Contato 3" , "3456-7890" , "contato3@email.com");

        Lista<Contato> vetorContato = new Lista<>(2);

        vetorContato.adiciona(c1);
        vetorContato.adiciona(c2);
        vetorContato.adiciona(c3);

        System.out.println(vetorContato);

        Lista<String> vetorString = new Lista<>(8);

        vetorString.adiciona("Elemento 1");
        vetorString.adiciona("Elemento 2");
        vetorString.adiciona("Elemento 3");

        System.out.println(vetorString);

        Lista<Integer> vetorInteger = new Lista<>(5);

        vetorInteger.adiciona(1);
        vetorInteger.adiciona(2);
        vetorInteger.adiciona(3);
        vetorInteger.adiciona(4);
        vetorInteger.adiciona(5);

        System.out.println(vetorInteger);

        }
}
