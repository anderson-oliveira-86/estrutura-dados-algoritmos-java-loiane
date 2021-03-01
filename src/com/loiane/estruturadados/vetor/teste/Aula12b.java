package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12b {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();


        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("C");
        arrayList.add("C");
        arrayList.add("C");
        System.out.println(arrayList);

        //arrayList.add(1,"B");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");


        if(existe){
            System.out.println("Esse elemento existe no array");
        }else {
            System.out.println("Esse elemento Não existe no array");
        }

        int pos = arrayList.indexOf("D");
        if(pos > -1){
            System.out.println("Esse elemento existe no array");
        }else {
            System.out.println("Esse elemento Não existe no array " + pos);
        }

        System.out.println(arrayList.get(2));

        int txt = arrayList.indexOf("C");
        System.out.println("Index Of " + txt);

        txt = arrayList.lastIndexOf("G");
        System.out.println("Last Index Of " + txt);

    }
}
