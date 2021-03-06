package com.loiane.estruturadados.base;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;



    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // solução mais eficiente do livro "effective java"
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    protected boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new IllegalArgumentException("Vetor já está cheio, não é possível adicionar mais elementos");
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = (T) elemento;
        this.tamanho++;
        return false;
    }

    protected void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }
}